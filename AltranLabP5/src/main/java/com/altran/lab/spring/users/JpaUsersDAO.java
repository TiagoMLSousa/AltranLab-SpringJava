package com.altran.lab.spring.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
/**
 * 
 * @author Altran
 */

//@Repository
public interface JpaUsersDAO extends JpaRepository<User, Integer>, UsersDAO {
    
}
