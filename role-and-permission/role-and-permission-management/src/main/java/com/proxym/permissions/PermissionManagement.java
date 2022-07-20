package com.proxym.permissions;

import com.proxym.role.permission.common.interfaces.PermissionDefinition;
import com.proxym.role.permission.common.dto.PermissionDto;
import org.springframework.stereotype.Component;

@Component
public class PermissionManagement implements PermissionDefinition {
    @Override
    public PermissionDto create() {
        return PermissionDto.builder().category("PERMISSION").name("PERMISSION_MANAGEMENT").enabled(true).build();
    }
}
