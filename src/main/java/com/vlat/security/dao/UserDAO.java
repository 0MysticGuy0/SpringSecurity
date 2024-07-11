package com.vlat.security.dao;

import com.vlat.security.entity.User;

public interface UserDAO {
    public User save(User user);
    public User get(int id);
    public User getByEmail(String email);
}
