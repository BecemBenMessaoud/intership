package com.proxym.dto;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public  class PermissionDto {
        @Id
        @GeneratedValue
        private Long id ;

        private String name;
        private String category;
        private boolean enabled;

    }

