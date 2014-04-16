/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altran.lab.spring.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

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
    
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String welcomeUser(
                @RequestParam/*(value = "username")*/ 
                    String username,
                Model model) {
        
        model.addAttribute("message", "Hello "
                + username
                + ". Welcome to our website!");
        
        return "welcome";
    }
}