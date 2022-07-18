package com.proxym.services;

import com.proxym.dto.RoleDto;

import java.util.List;

public interface RoleService {

    RoleDto addRole(RoleDto roleDto);
    List<RoleDto> getAllRoles();
    void deleteRole (long roleId);
    RoleDto updateRole(RoleDto role,long roleId);
}
