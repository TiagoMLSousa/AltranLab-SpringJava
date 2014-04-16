/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altran.lab.spring.hello;

import javax.annotation.Resource;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Altran
 */
@Component
public class HelloPrinter {

    //@Autowired
    @Resource(name = "hello")
    private IHello helloInstance;
    
    public HelloPrinter() {
    }

    public HelloPrinter(IHello helloInstance) {
        this.helloInstance = helloInstance;
    }

    /**
     * @return the helloInstance
     */
    public IHello getHelloInstance() {
        return helloInstance;
    }

    /**
     * @param helloInstance the helloInstance to set
     */
    public void setHelloInstance(IHello helloInstance) {
        this.helloInstance = helloInstance;
    }
    
    public String printHello() {
        return getHelloInstance() != null ? getHelloInstance().getMessage() : null;
    }
}
