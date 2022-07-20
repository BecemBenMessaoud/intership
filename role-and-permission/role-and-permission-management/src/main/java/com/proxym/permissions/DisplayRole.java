package com.proxym.permissions;

import com.proxym.role.permission.common.interfaces.PermissionDefinition;
import com.proxym.role.permission.common.dto.PermissionDto;
import org.springframework.stereotype.Component;

@Component
public class DisplayRole implements PermissionDefinition {
    @Override
    public PermissionDto create() {
        return PermissionDto.builder().name("DISPLAY").category("ROLE_MANAGEMENT").enabled(true).build();
    }
}
