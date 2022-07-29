package com.proxym.entities;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
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
  @Column(unique = true)
  private String name;
  private String category;
  private boolean enabled;
  @ManyToMany(fetch= FetchType.EAGER)
  @JoinTable(
          name="PERMISSION_ROLE",
          joinColumns =@JoinColumn(name="permission", referencedColumnName = "ID"),
          inverseJoinColumns=@JoinColumn(name = "role" , referencedColumnName = "ID"))
  private List<Role> roleList= new ArrayList<>();
}
