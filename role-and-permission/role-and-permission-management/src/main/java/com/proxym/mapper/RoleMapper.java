package com.proxym.mapper;

import com.proxym.dto.RoleDto;
import com.proxym.entities.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
@Component
@RequiredArgsConstructor
public class RoleMapper extends GenericMapper<Role, RoleDto>{
    @Override
   public RoleDto mapToDto(Role role) {
        return RoleDto.builder()
                .id(role.getId())
                .name(role.getName())
                .description(role.getDescription())
                .build();
    }

    @Override
   public Role mapToEntity(RoleDto roleDto) {
        return Role.builder()
                .id(roleDto.getId())
                .name(roleDto.getName())
                .description(roleDto.getDescription())
                .build();
    }
}
