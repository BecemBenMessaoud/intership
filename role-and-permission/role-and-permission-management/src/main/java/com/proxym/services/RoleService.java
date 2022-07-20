package com.proxym.services;

import com.proxym.role.permission.common.dto.RoleDto;

import java.util.List;

public interface RoleService {

    RoleDto addRole(RoleDto roleDto);
    List<RoleDto> getAllRoles();
    void deleteRole (long roleId);
    RoleDto updateRole(RoleDto role,long roleId);
}
