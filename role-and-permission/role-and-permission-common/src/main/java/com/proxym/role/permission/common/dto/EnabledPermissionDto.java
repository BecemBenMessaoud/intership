package com.proxym.role.permission.common.dto;

import lombok.*;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EnabledPermissionDto {
    private Long id ;
    private String name;
    private String category;


}