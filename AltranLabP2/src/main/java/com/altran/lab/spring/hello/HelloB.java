package com.altran.lab.spring.hello;

import org.springframework.stereotype.Component;

/**
 * Hello spring!
 * Spring bean
 * 
 * @author Altran
 */

@Component
public class HelloB implements IHello {
    private String message;

    public HelloB() {
        this("BBB");
    }
    
    public HelloB(String message) {
        this.message = message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}