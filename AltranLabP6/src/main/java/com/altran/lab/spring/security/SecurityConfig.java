package com.altran.lab.spring.security;

import org.springframework.beans.factory.annotation.Autowired; import org.springframework.context.annotation.*; 
import org.springframework.security.config.annotation.authentication.builders.*; 
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.*; 
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

@Configuration 
@EnableWebMvcSecurity 
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    
    @Autowired 
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception { 
        //TODO: connect with Spring Data
        auth
            .inMemoryAuthentication() 
                .withUser("user").password("password").roles("USER"); 
    } 
    
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .anyRequest().authenticated()
                .and()
            .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/welcome", true)
                .permitAll();     
    }
}
