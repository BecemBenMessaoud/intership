package com.proxym.dao;

import com.proxym.entities.Role;

import java.util.List;
import java.util.Optional;

public interface RoleDao {
    Role addRole(Role role);
    List<Role> selectAllRoles();
    void deleteRole (long roleId);
    Role updateRole(Role role,long roleId);
    Optional<Role> findById(long roleId);


}
