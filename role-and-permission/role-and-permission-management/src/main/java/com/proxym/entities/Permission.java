package com.proxym.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Permission {
  @Id
  @GeneratedValue
  private Long id ;

  private String name;
  private String category;
  private boolean enabled;

}
