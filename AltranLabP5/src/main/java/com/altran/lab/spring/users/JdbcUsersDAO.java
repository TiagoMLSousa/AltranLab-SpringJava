/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altran.lab.spring.users;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Altran
 */
@Repository
public class JdbcUsersDAO implements UsersDAO {
    
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
    RowMapper<User> rowMapper = new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User();
                user.setId(rs.getInt("name"));
                user.setName(rs.getString("name"));
                user.setEmailaddress(rs.getString("emailaddress"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                return user;
            }
        };
    
    public List<User> getAll() {
        List<User> users = this.jdbcTemplate.query(
            "select * from Users",
            rowMapper);
        
        return users;
    }
    
    public User getUserByUsername(String username) {
        User user = this.jdbcTemplate.queryForObject(
            "select * from Users where username = ?",
            new Object[] { username },
            rowMapper);
        
        return user;
    }
    
    public User save(User user) {
        int rowCount = 
            this.jdbcTemplate.update(
                "update Users set (name, emailaddress, username, password) values (?, ?, ?, ?)", 
                user.getName(), user.getEmailaddress(), user.getUsername(), user.getPassword());
        
        if(rowCount == 0)
            this.jdbcTemplate.update(
                "insert into Users (name, emailaddress, username, password) values (?, ?, ?, ?)", 
                user.getName(), user.getEmailaddress(), user.getUsername(), user.getPassword());
        
        return user;
    }
}
