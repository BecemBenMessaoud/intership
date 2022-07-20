package com.proxym.role.permission.common.dto;

import lombok.*;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public  class PermissionDto {
        private Long id ;
        private String name;
        private String category;
        private boolean enabled;
}

