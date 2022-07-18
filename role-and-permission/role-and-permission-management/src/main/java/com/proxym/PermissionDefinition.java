package com.proxym;

import com.proxym.dto.PermissionDto;
import com.proxym.dto.RoleDto;

import java.util.List;

public class PermissionDefinition implements com.proxym.definitions.PermissionDefinition {
    @Override
    public PermissionDto create() {
        return null;
    }

    @Override
    public PermissionDto management() {
        return null;
    }

    @Override
    public List<PermissionDto> listing() {
        return null;
    }

    @Override
    public List<RoleDto> listingRole() {
        return null;
    }
}
