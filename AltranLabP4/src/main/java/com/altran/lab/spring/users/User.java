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
public class User {
    private int id;
    private String name;
    private String birthday;
    
    private String emailaddress;
    private String phonenumber;
    
    private String username;
    private String password;

    public User() {
    }

    public User(int id, String name, String birthday, String emailaddress, String phonenumber, String username, String password) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.emailaddress = emailaddress;
        this.phonenumber = phonenumber;
        this.username = username;
        this.password = password;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the birthday
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * @param birthday the birthday to set
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * @return the emailaddress
     */
    public String getEmailaddress() {
        return emailaddress;
    }

    /**
     * @param emailaddress the emailaddress to set
     */
    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    /**
     * @return the phonenumber
     */
    public String getPhonenumber() {
        return phonenumber;
    }

    /**
     * @param phonenumber the phonenumber to set
     */
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
