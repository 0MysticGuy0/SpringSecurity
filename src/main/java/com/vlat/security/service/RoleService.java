package com.vlat.security.service;

import com.vlat.security.entity.Role;

public interface RoleService {
    public Role save(Role role);
    public Role get(int id);
}
