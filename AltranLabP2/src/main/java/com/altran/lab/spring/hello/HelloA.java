/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altran.lab.spring.hello;

/**
 *
 * @author Altran
 */
public class HelloA implements IHello {
    private String message;

    public HelloA() {
        this("AAA");
    }
    
    public HelloA(String message) {
        this.message = message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
