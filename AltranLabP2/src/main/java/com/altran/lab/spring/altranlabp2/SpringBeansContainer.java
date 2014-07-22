/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altran.lab.spring.altranlabp2;


/**
 *
 * @author Altran
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeansContainer {

  @Bean
  public MessageClient emailClient() {
      MessageClient consumer = new MessageClient();
      consumer.setMessageService(emailService());
      return consumer;
  }
  
  @Bean
  public MessageClient smsClient() {
      return new MessageClient(smsService());
  }
  
  @Bean
  public MessageService emailService() {
      return new EmailService();
  }
  
  @Bean
  public MessageService smsService() {
      return new SmsService();
  }
}
