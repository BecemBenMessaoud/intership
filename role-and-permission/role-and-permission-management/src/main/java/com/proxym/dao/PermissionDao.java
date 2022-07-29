package com.proxym.dao;

import com.proxym.entities.Permission;

import java.util.List;


public interface PermissionDao {
   Permission addPermission(Permission p);

   List<Permission> selectAllPermission();
   List<Permission> addAllPermission(List<Permission> permissionList);
   Permission enablePermission(Long id);
   Permission disablePermission (Long id);
   List<Permission> findEnabledList ();
   List<Permission> deleteAllPermission(List<Permission> permissionList);
   Permission findByName(String name);
  }

