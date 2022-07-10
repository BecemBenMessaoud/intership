package com.proxym.dto;

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