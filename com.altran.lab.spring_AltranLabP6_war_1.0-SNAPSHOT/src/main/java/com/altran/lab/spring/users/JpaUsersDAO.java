package com.altran.lab.spring.users;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
 
/**
 * 
 * @author Altran
 */

@Repository
public class JpaUsersDAO  implements UsersDAO {
    
    
   @PersistenceContext
   private EntityManager entityManager;
    
    @Override
    public List<User> getAll() {
        // native
        List<User> users = entityManager.createNativeQuery("select * from Users", User.class)
                .getResultList();
        return users;
    }
    
    public User getUserById(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public User getUserByUsername(String username) {
        System.out.println(username);
        return (User) entityManager.createQuery("select user from User user where user.username=:username")
               .setParameter("username", username)
               .getSingleResult();
    }

    @Override
    public User save(User user) {
        entityManager.persist(user);
        return user;
    }
    
   @Override
    public void delete(User user) {
        entityManager.remove(user);
    }
}
