package com.proxym.mapper;

import com.proxym.dto.PermissionDto;
import com.proxym.entities.Permission;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PermissionMapper extends GenericMapper<Permission, PermissionDto>{

    @Override
    public PermissionDto mapToDto(Permission permission) {
//        PermissionDto permissionDto = new PermissionDto();
//        permissionDto.setCategory(permission.getCategory());
//        permissionDto.setId(permission.getId());
//        permissionDto.setName(permission.getName());
//        permissionDto.setEnabled(permission.isEnabled());
//        return permissionDto;
        return PermissionDto.builder()
                .id(permission.getId())
                .category(permission.getCategory())
                .name(permission.getName())
                .enabled(permission.isEnabled())
                .build();
    }

    @Override
    public Permission mapToEntity(PermissionDto permissionDto) {
        Permission permission = new Permission();
        permission.setName(permissionDto.getName());
        permission.setCategory(permissionDto.getCategory());
        permission.setId(permissionDto.getId());
        permission.setEnabled(permissionDto.isEnabled());
        return permission;
    }

}
