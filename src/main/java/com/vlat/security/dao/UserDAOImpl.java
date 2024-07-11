package com.vlat.security.dao;

import com.vlat.security.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {
    @Autowired
    SessionFactory factory;

    @Transactional
    @Override
    public User save(User user) {
        Session session = factory.getCurrentSession();
        return session.merge(user);
    }

    @Transactional
    @Override
    public User get(int id) {
        Session session = factory.getCurrentSession();
        User user = session.get(User.class, id);
        return user;
    }

    @Transactional
    @Override
    public User getByEmail(String email) {
        Session session = factory.getCurrentSession();
        List<User> users = session.createQuery("from User where email='"+email+"'"
                , User.class).getResultList();
        if(users.isEmpty()){
            return null;
        }
        User user = users.get(0);
        System.out.println(user);
        return user;
    }
}
