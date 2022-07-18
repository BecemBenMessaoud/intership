package com.proxym.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    @Id
    @GeneratedValue
    private Long id ;
    private String name;
    private String description;
    @ManyToMany(mappedBy = "roleList")
    List<Permission> permissionList;
}
