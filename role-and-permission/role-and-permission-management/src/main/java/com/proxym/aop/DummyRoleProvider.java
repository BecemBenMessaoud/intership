package com.proxym.aop;

import com.proxym.role.permission.common.dto.RoleDto;
import com.proxym.services.PermissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DummyRoleProvider {
    private final PermissionService permissionService;
    public RoleDto create (){
        RoleDto roleDto = new RoleDto();
         roleDto.setPermissionDtoList(permissionService.getAllPermission());
        return roleDto;
    }
}
