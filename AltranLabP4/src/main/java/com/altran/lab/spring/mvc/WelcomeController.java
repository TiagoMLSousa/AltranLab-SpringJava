/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altran.lab.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Altran
 */
@Controller
@RequestMapping("/welcome")
public class WelcomeController {
    
    public WelcomeController() {
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String welcome(Model model) {
        
        model.addAttribute("message", "Hello annonymous user! Welcome to our website!");
        
        return "welcome";
    }
    
    @RequestMapping(value = "/user/{username}", method = RequestMethod.GET)
    public String welcomeUser(
                @PathVariable/*(value = "username")*/ 
                    String username,
                Model model) {
        
        model.addAttribute("message", "Hello "
                + username
                + ". Welcome to our website!");
        
        return "welcome";
    }
}