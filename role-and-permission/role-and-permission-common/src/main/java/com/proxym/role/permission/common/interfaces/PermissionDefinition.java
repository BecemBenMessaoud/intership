package com.proxym.role.permission.common.interfaces;

import com.proxym.role.permission.common.dto.PermissionDto;

public interface PermissionDefinition {
    //implement this interface in order to add a new permission
    PermissionDto create();
}
