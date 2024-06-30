package ru.saidmagomed.PP_312.Spring.Boot.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import ru.saidmagomed.PP_312.Spring.Boot.models.User;

import java.util.List;

@Repository
public class UserDaoImp implements UserDao {
    @PersistenceContext
    private EntityManager em;

    @Override
    public void addUser(User user) {
        em.persist(user);
    }

    @Override
    public List<User> getAllUsers() {
        String getAllQuery = "select u from User u";
        TypedQuery<User> query = em.createQuery(getAllQuery, User.class);
        return query.getResultList();
    }

    @Override
    public User getUserById(long userid) {
        return em.find(User.class, userid);
    }

    @Override
    public void updateUser(long id, User updateUser) {
        em.merge(updateUser);

    }

    @Override
    public void removeUser(long id) {
        em.remove(getUserById(id));
    }
}
