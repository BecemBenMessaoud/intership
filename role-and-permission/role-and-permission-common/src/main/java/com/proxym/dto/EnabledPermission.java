package com.proxym.dto;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class EnabledPermission {
    @Id
    @GeneratedValue
    private Long id ;

    private String name;
    private String category;


}