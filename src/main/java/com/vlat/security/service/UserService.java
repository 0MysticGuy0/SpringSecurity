package com.vlat.security.service;

import com.vlat.security.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    public User save(User user);
    public User get(int id);
    public User getByEmail(String email);
}
