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
  public IConsumer emailConsumer() {
      MessageConsumer consumer = new MessageConsumer();
      consumer.setMessageService(emailService());
      return consumer;
  }
  
  @Bean
  public IConsumer smsConsumer() {
      return new MessageConsumer(smsService());
  }
  
  @Bean
  public IMessageService emailService() {
      return new EmailService();
  }
  
  @Bean
  public IMessageService smsService() {
      return new SmsService();
  }
}
