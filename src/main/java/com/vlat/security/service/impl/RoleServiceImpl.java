package com.vlat.security.service.impl;

import com.vlat.security.dao.RoleDAO;
import com.vlat.security.entity.Role;
import com.vlat.security.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleDAO roleDAO;

    @Transactional
    @Override
    public Role save(Role role) {
        return roleDAO.save(role);
    }

    @Transactional
    @Override
    public Role get(int id) {
        return roleDAO.get(id);
    }
}
