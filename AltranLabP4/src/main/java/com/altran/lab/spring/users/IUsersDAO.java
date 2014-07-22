/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altran.lab.spring.users;

import java.util.List;

/**
 *
 * @author Altran
 */
public interface IUsersDAO {
    List<User> getUsers();
    User getUserByUsername(String username);
    boolean createUser(User user);
}
