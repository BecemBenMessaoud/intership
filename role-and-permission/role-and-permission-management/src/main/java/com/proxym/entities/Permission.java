package com.proxym.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Permission {
  @Id
  @GeneratedValue
  @Column(name="ID")
  private Long id ;
  private String name;
  private String category;
  private boolean enabled;
  @ManyToMany
  @JoinTable(
          name="role",joinColumns =@JoinColumn(name="permission",
            referencedColumnName = "ID"),inverseJoinColumns=@JoinColumn(name = "role" ,
               referencedColumnName = "ID"))
  private List<Role> roleList;
}
