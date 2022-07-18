package com.proxym.definitions;

import com.proxym.dto.PermissionDto;
import com.proxym.dto.RoleDto;

import java.util.List;

public interface PermissionDefinition {
    PermissionDto create();
    PermissionDto management();
    List<PermissionDto> listing();
    List<RoleDto> listingRole();
}
