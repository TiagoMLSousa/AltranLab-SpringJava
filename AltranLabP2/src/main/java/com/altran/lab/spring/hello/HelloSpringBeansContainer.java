/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altran.lab.spring.hello;

import com.altran.lab.spring.hello.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Altran
 */

@Configuration
public class HelloSpringBeansContainer {

  @Bean
  public IHello hello() {
      return new HelloB();
  }
  @Bean
  public IHello hello2() {
      HelloB b = new HelloB();
      b.setMessage("This message comes from Java injection");
      return b;
  }
  @Bean
  public IHello hello3() {
      return new HelloB("This message comes from Java injection by constructor");
  }
  
  @Bean
  public HelloPrinter helloPrinter() {
      return new HelloPrinter();
  }
}
