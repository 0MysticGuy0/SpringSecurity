package com.vlat.security.dao;

import com.vlat.security.entity.Role;

public interface RoleDAO {
    public Role save(Role role);
    public Role get(int id);
}
