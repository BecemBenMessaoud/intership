package com.proxym.mapper;

import com.proxym.dto.PermissionDto;
import com.proxym.entities.Permission;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EnabledPermissionMapper extends GenericMapper<Permission, PermissionDto> {


    @Override
   public PermissionDto mapToDto(Permission permission) {
        return PermissionDto.builder()
                .id(permission.getId())
                .category(permission.getCategory())
                .name(permission.getName())
                .build();
    }

    @Override
   public Permission mapToEntity(PermissionDto permissionDto) {
        Permission permission = new Permission();
        permission.setName(permissionDto.getName());
        permission.setCategory(permissionDto.getCategory());
        permission.setId(permissionDto.getId());
        return permission;
    }
}
