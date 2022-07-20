package com.proxym.permissions;
import com.proxym.role.permission.common.interfaces.PermissionDefinition;
import com.proxym.role.permission.common.dto.PermissionDto;
import org.springframework.stereotype.Component;
@Component
public class DisplayPermission implements PermissionDefinition {

    @Override
    public PermissionDto create() {
        return PermissionDto.builder().name("DISPLAY").category("PERMISSION_MANAGEMENT1").enabled(true).build();
    }

}
