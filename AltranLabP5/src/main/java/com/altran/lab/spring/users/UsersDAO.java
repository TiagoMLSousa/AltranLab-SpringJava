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
public interface UsersDAO {
    List<User> getAll();
    User getUserByUsername(String username);
    User save(User user);
}
