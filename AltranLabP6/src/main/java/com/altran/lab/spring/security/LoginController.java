/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altran.lab.spring.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Altran
 */

@Controller
@RequestMapping("/login**" )
public class LoginController {
    
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView login(
            @RequestParam(value = "error", required = false) String error,
            @RequestParam(value = "logout", required = false) String logout) {

            ModelAndView model = new ModelAndView();
            if (error != null && error != "") {
                model.addObject("error", "Invalid username and password!");
            }
            else if (logout != null && logout != "") {
                model.addObject("msg", "You've been logged out successfully.");
            }
            
            model.setViewName("login");
            return model;
    }
}
