package com.proxym.services;

import com.proxym.dao.PermissionDao;
import com.proxym.role.permission.common.dto.EnabledPermissionDto;
import com.proxym.role.permission.common.dto.PermissionDto;
import com.proxym.mapper.PermissionMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PermissionServiceImpl implements  PermissionService{

    private final PermissionDao permissionDao;
    private final PermissionMapper permissionMapper;

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
        return permissionMapper.mapToDto(permissionDao.enablePermission(id));
    }

    @Override
    public PermissionDto disablePermission(Long id) {
        return permissionMapper.mapToDto(permissionDao.disablePermission(id));
    }

    @Override
    public List<EnabledPermissionDto> findEnabled() {
        return permissionDao.findEnabledList().stream().map(permission ->
             EnabledPermissionDto.builder()
                     .id(permission.getId())
                     .category(permission.getCategory())
                     .name(permission.getName())
                     .build()
        ).collect(Collectors.toList());
    }

    @Override
    public void deleteAllPermission(List<PermissionDto> permissionDtoList) {
        permissionMapper.mapToDtoList(permissionDao.deleteAllPermission(permissionMapper.mapToEntityList(permissionDtoList)));
    }


}
