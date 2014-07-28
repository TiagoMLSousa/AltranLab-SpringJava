/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altran.lab.spring.mvc;

import com.altran.lab.spring.users.UsersDAO;
import com.altran.lab.spring.users.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Transactional
@RequestMapping("/users")
public class UsersController {
    
    @Autowired(required = true)
    @Qualifier(value = "jpaUsersDAO")
    UsersDAO usersDAO;
    
    @RequestMapping
    public String users(ModelMap model) {
        List<User> users = usersDAO.getAll();
        model.put("users", users);
        return "users";
    }
    
    @RequestMapping(value = "/{username}/", method = RequestMethod.GET)
    public String user(@PathVariable String username, ModelMap model) {
        User user = usersDAO.getUserByUsername(username);
        
        if(user == null) {
            throw new IllegalArgumentException("User not found");
        }
        
        model.addAttribute("user", user);
        return "user";
    }
    
    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String getNewForm(ModelMap model) {
        model.put("user", new User());
        return "create_user";
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String createUser(@ModelAttribute User user, ModelMap model) {
        usersDAO.save(user);
        return "redirect:/users";
    }
}
