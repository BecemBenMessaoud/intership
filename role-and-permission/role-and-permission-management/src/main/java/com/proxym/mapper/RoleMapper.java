package com.proxym.mapper;

import com.proxym.entities.Permission;
import com.proxym.role.permission.common.dto.RoleDto;
import com.proxym.entities.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
@Component
@RequiredArgsConstructor
public class RoleMapper extends GenericMapper<Role, RoleDto>{
    private final PermissionMapper permissionMapper;
    @Override
   public RoleDto mapToDto(Role role) {
        return RoleDto.builder()
                .id(role.getId())
                .name(role.getName())
                .description(role.getDescription())
                .permissionDtoList(permissionMapper.mapToDtoList(role.getPermissionList()))
                .build();
    }

    @Override
   public Role mapToEntity(RoleDto roleDto) {
        return Role.builder()
                .id(roleDto.getId())
                .name(roleDto.getName())
                .description(roleDto.getDescription())
                .permissionList(permissionMapper.mapToEntityList(roleDto.getPermissionDtoList()))
                .build();
    }
}
