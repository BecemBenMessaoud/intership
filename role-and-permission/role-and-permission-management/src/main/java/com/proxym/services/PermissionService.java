package com.proxym.services;


import com.proxym.dto.EnabledPermissionDto;
import com.proxym.dto.PermissionDto;

import java.util.List;

public interface PermissionService {
    PermissionDto addPermission(PermissionDto permissionDto);
    List<PermissionDto> getAllPermission();
    List<PermissionDto> addAllPermission(List<PermissionDto> permissionDto);
    PermissionDto enablePermission(Long id);
    PermissionDto disablePermission(Long id);
    List<EnabledPermissionDto> findEnabled();

}
