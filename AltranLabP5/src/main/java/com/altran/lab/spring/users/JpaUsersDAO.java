package com.altran.lab.spring.users;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
 
/**
 * 
 * @author Altran
 */

@Repository
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class JpaUsersDAO implements UsersDAO {
    
    @PersistenceUnit
    private EntityManagerFactory emf;
    
    private EntityManager em;
    
    public EntityManagerFactory getEmf() {
        return emf;
    }

    public void setEmf(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @PostConstruct
    public void init() {
        em = emf.createEntityManager();
    }
    
    @Override
    public List<User> getAll() {
        // native
        //EntityManager em = emf.createEntityManager();
        List<User> users = em.createNativeQuery("select * from Users", User.class)
                .getResultList();
        return users;
    }
    
    public User getUserById(int id) {
        //EntityManager em = emf.createEntityManager();
        return em.find(User.class, id);
    }

    @Override
    public User getUserByUsername(String username) {
        System.out.println(username);
        //EntityManager em = emf.createEntityManager();
        return (User) em.createQuery("select user from User user where user.username=:username")
               .setParameter("username", username)
               .getSingleResult();
    }

    @Override
    public User save(User user) {
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        return user;
    }
}
