package com.proxym.services;

import com.proxym.dao.PermissionDao;
import com.proxym.dto.EnabledPermission;
import com.proxym.dto.PermissionDto;
import com.proxym.entities.Permission;
import com.proxym.mapper.EnabledPermissionMapper;
import com.proxym.mapper.PermissionMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PermissionServiceImpl implements  PermissionService{

    private final PermissionDao permissionDao;
    private final PermissionMapper permissionMapper;
    private final EnabledPermissionMapper enabledPermissionMapper;

    @Override
    public PermissionDto addPermission(PermissionDto permissionDto) {
        return permissionMapper.mapToDto(permissionDao.addPermission(permissionMapper.mapToEntity(permissionDto)));
    }

    @Override
    public List<PermissionDto> getAllPermission() {
        return permissionMapper.mapToDtoList(permissionDao.selectAllPermission());
    }

    @Override
    public List<PermissionDto> addAllPermission(List<PermissionDto> permissionDto) {
        return permissionMapper.mapToDtoList(permissionDao.addAllPermission(permissionMapper.mapToEntityList(permissionDto)));
    }

    @Override
    public PermissionDto enablePermission(Long id) {
        return enabledPermissionMapper.mapToDto(permissionDao.enablePermission(id));
    }

    @Override
    public PermissionDto disablePermission(Long id) {
        return permissionMapper.mapToDto(permissionDao.disablePermission(id));
    }

    @Override
    public List<EnabledPermission> findEnabledList(PermissionDto permissionDto) {
       return null;
    }
}
