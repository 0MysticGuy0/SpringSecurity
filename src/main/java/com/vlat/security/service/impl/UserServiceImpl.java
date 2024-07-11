package com.vlat.security.service.impl;

import com.vlat.security.dao.UserDAO;
import com.vlat.security.entity.User;
import com.vlat.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDAO userDAO;

    @Transactional
    @Override
    public User save(User user) {
        return userDAO.save(user);
    }

    @Transactional
    @Override
    public User get(int id) {
        return userDAO.get(id);
    }

    @Transactional
    @Override
    public User getByEmail(String email) {
        return userDAO.getByEmail(email);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return getByEmail(username);
    }
}
