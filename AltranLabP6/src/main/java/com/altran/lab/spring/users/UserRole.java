/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altran.lab.spring.users;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.context.annotation.Role;

/**
 *
 * @author Altran
 */


@Entity
@Table (name = "user_roles")
public class UserRole implements Serializable {
    public enum Role {ADMIN_ROLE, USER_ROLE}
    
    @Id
    private String username;
    @Enumerated(EnumType.STRING)
    private Role userRole;

    public UserRole() {         
    
    }
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Role getUserRole() {
        return userRole;
    }

    public void setUserRole(Role userRole) {
        this.userRole = userRole;
    }
}
