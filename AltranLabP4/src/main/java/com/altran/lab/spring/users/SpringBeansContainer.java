/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altran.lab.spring.users;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Altran
 */

@Configuration
public class SpringBeansContainer {

  @Bean
  public UsersDAO usersDAO() {
      return new UsersDAOMock();
  }
  
}
