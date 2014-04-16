/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altran.lab.spring.mvc;

import com.altran.lab.spring.users.IUsersDAO;
import com.altran.lab.spring.users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/users")
public class UsersController {
    
    @Autowired(required = true)
    IUsersDAO usersDAO;
    
    @RequestMapping(value = "/get/{username}", method = RequestMethod.GET)
    public String user(@PathVariable String username, ModelMap model) {
        
        User user = usersDAO.getUserByUsername(username);
        
        if(user == null)
            return "404";
        
        model.addAttribute("user", user);
        
        return "user";
    }
    
}
