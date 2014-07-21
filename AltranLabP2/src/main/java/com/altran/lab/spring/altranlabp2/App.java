package com.altran.lab.spring.altranlabp2;

/**
 * Hello world!
 *
 */
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        /* Xml */
        ClassPathXmlApplicationContext classPathXmlContext = new ClassPathXmlApplicationContext("SpringBeans.xml");

        /* Annotations */
        AnnotationConfigApplicationContext annotationConfigContext = new AnnotationConfigApplicationContext(SpringBeansContainer.class);

        IConsumer consumer1 = classPathXmlContext.getBean("emailConsumer", IConsumer.class);
        IConsumer consumer2 = classPathXmlContext.getBean("smsConsumer", IConsumer.class);
        
        IConsumer consumer3 = annotationConfigContext.getBean("emailConsumer", IConsumer.class);
        IConsumer consumer4 = annotationConfigContext.getBean("smsConsumer", IConsumer.class);
        
        consumer1.processMessages(" Hello 1! ", "recipient 1");
        consumer2.processMessages(" Hello 2! ", "recipient 2");
        consumer3.processMessages(" Hello 3! ", "recipient 3");
        consumer4.processMessages(" Hello 4! ", "recipient 4");
    }
}
