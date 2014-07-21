/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altran.lab.spring.users;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author Altran
 */
@Component
public class UsersDAOMock implements IUsersDAO {
    private static List<User> users = null;
    
    public UsersDAOMock() {
            users = new ArrayList<User>();
            users.add(new User(1, "Teste 1", "1990-02-01", "teste1@altran.com", null, "user1", "password"));
            users.add(new User(2, "Teste 2", "1980-03-11", "teste2@altran.com", null, "user2", "password"));
            users.add(new User(3, "Teste 3", "1985-07-26", "teste3@altran.com", null, "user3", "password"));
    }

    @Override
    public User getUserByUsername(String username) {
       
        for(User user : users)
            if(user.getUsername() != null 
               && user.getUsername().compareToIgnoreCase(username) == 0)
                return user;

        return null;
    }

    @Override
    public boolean createUser(User user) {
       return users.add(user);
    }

    @Override
    public List<User> getUsers() {
       return users;
    }
       
}
