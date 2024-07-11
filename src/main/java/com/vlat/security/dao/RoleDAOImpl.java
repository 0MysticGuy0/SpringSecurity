package com.vlat.security.dao;

import com.vlat.security.entity.Role;
import com.vlat.security.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDAOImpl implements RoleDAO {
    @Autowired
    SessionFactory factory;

    @Override
    public Role save(Role role) {
        Session session = factory.getCurrentSession();
        return session.merge(role);
    }

    @Override
    public Role get(int id) {
        Session session = factory.getCurrentSession();
        Role role = session.get(Role.class, id);
        return role;
    }
}
