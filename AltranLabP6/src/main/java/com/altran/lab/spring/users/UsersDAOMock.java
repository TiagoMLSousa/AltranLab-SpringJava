/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altran.lab.spring.users;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Altran
 */
public class UsersDAOMock implements UsersDAO {
    private static List<User> users = null;
    
    public UsersDAOMock() {
        users = new ArrayList<User>();
        users.add(new User(1, "Teste 1", "teste1@altran.com", "user1", "password"));
        users.add(new User(2, "Teste 2", "teste2@altran.com", "user2", "password"));
        users.add(new User(3, "Teste 3", "teste3@altran.com", "user3", "password"));
    }
    
    @Override
    public List<User> getAll() {
        return users;
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
    public User save(User user) {
        users.add(user);
        return user;
    }

    @Override
    public void delete(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
