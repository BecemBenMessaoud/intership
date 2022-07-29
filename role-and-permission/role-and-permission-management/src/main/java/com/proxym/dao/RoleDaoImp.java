package com.proxym.dao;


import com.proxym.entities.Permission;
import com.proxym.entities.Role;
import com.proxym.repositories.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class RoleDaoImp implements RoleDao {
    private final RoleRepository roleRepository;
    private final PermissionDao permissionDao;
    @Override
    public Role addRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public List<Role> selectAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public void deleteRole(long roleId) {
        Optional <Role> role =roleRepository.findById(roleId);
        if (role.isPresent()) {
            roleRepository.delete(role.get());
        }
    }
    @Override
    public Role updateRole(Role role,long roleId) {
        if (roleRepository.findById(roleId).isPresent()) {
            role.setId(roleId);
            return roleRepository.save(role);
        }
        return null;
    }

    @Override
    public Optional<Role> findById(long roleId) {
        Optional<Role> role= roleRepository.findById(roleId);
        return role;
    }
}
