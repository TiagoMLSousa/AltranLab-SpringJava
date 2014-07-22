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

        MessageClient client1 = classPathXmlContext.getBean("emailClient", MessageClient.class);
        MessageClient client2 = classPathXmlContext.getBean("smsClient", MessageClient.class);
        
        MessageClient client3 = annotationConfigContext.getBean("emailClient", MessageClient.class);
        MessageClient client4 = annotationConfigContext.getBean("smsClient", MessageClient.class);

        
        // outputs
        
        client1.processMessages(" Hello from XML 1! ", "recipient 1");
        client2.processMessages(" Hello from XML 2! ", "recipient 2");
        client3.processMessages(" Hello from Annotation 3! ", "recipient 3");
        client4.processMessages(" Hello from Annotation 4! ", "recipient 4");
    }
}
