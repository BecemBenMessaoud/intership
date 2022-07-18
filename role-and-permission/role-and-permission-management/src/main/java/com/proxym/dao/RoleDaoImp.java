package com.proxym.dao;


import com.proxym.entities.Role;
import com.proxym.repositories.RoleRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RoleDaoImp implements RoleDao {
    private final RoleRepository roleRepository;
    public RoleDaoImp(RoleRepository roleRepository){
        this.roleRepository=roleRepository;
    }
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
