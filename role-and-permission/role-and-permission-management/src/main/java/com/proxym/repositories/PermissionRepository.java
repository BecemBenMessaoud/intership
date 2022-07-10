package com.proxym.repositories;


import com.proxym.entities.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PermissionRepository extends JpaRepository<Permission, Long> {
    List<Permission> findByEnabledIsTrue();



}
