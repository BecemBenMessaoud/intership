package com.proxym.services;


import com.proxym.role.permission.common.dto.EnabledPermissionDto;
import com.proxym.role.permission.common.dto.PermissionDto;

import java.util.List;

public interface PermissionService {
    PermissionDto addPermission(PermissionDto permissionDto);
    List<PermissionDto> getAllPermission();
    List<PermissionDto> addAllPermission(List<PermissionDto> permissionDto);
    PermissionDto enablePermission(Long id);
    PermissionDto disablePermission(Long id);
    List<EnabledPermissionDto> findEnabled();
    void deleteAllPermission (List<PermissionDto> permissionDtoList);

}
