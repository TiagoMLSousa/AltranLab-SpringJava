/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.altran.lab.spring.hello;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Consultor
 */
public class HelloApplication {
    
   public static void main(String[] args) {
       /* Xml */
            ClassPathXmlApplicationContext classPathXmlContext = new ClassPathXmlApplicationContext("HelloSpringBeans.xml");
            IHello helloA = (IHello) classPathXmlContext.getBean("hello");
            IHello helloA2 = (IHello) classPathXmlContext.getBean("hello2");
            IHello helloA3 = (IHello) classPathXmlContext.getBean("hello3");
            HelloPrinter helloPrinterA = classPathXmlContext.getBean(HelloPrinter.class);
            
            /* Annotations */
            AnnotationConfigApplicationContext annotationConfigContext = new AnnotationConfigApplicationContext(HelloSpringBeansContainer.class);
            IHello helloB = (IHello) annotationConfigContext.getBean("hello");
            IHello helloB2 = (IHello) annotationConfigContext.getBean("hello2");
            IHello helloB3 = (IHello) annotationConfigContext.getBean("hello3");
            HelloPrinter helloPrinterB = annotationConfigContext.getBean(HelloPrinter.class);
            
            System.out.println("Hello A: "+helloA.getMessage());
            System.out.println("Hello A2: "+helloA2.getMessage());
            System.out.println("Hello A3: "+helloA3.getMessage());
            
            System.out.println("Hello B: "+helloB.getMessage());
            System.out.println("Hello B2: "+helloB2.getMessage());
            System.out.println("Hello B3: "+helloB3.getMessage());
            
            System.out.println("Printer A: "+helloPrinterA.printHello());
            System.out.println("Printer B: "+helloPrinterB.printHello());
   }
    
}
