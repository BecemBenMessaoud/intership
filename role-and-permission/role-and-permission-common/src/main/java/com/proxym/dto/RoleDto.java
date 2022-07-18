package com.proxym.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoleDto {
        private Long id ;
        private String name;
        private String description;
        List<PermissionDto> permissionDtoList;
    }


