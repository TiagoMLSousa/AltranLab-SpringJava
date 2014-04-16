<%@page import="com.altran.lab.spring.hello.HelloSpringBeansContainer"%>
<%@page import="com.altran.lab.spring.hello.HelloPrinter"%>
<%@page import="com.altran.lab.spring.hello.IHello"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="org.springframework.context.annotation.AnnotationConfigApplicationContext"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello Spring</title>
    </head>
    <body>
        <% 
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
            
        %>
        <h1>Hello A! <%= helloA.getMessage() %></h1>
        <h1>Hello A2! <%= helloA2.getMessage() %></h1>
        <h1>Hello A3! <%= helloA3.getMessage() %></h1>
        <br/>
        <h1>Hello B! <%= helloB.getMessage() %></h1>
        <h1>Hello B2! <%= helloB2.getMessage() %></h1>
        <h1>Hello B3! <%= helloB3.getMessage() %></h1>
        <br/>
        <h1>Hello Printer A! <%= helloPrinterA.printHello() %></h1>
        <h1>Hello Printer B! <%= helloPrinterB.printHello() %></h1>
    </body>
</html>
