package com.proxym.services;

import com.proxym.dao.RoleDao;
import com.proxym.dto.RoleDto;
import com.proxym.mapper.RoleMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class RoleSeviceImpl implements RoleService{
 private final RoleDao roleDao;
 private final RoleMapper roleMapper;

    @Override
    public RoleDto addRole(RoleDto roleDto) {
        return roleMapper.mapToDto(roleDao.addRole(roleMapper.mapToEntity(roleDto)));
    }

    @Override
    public List<RoleDto> getAllRoles() {
        return roleMapper.mapToDtoList(roleDao.selectAllRoles());
    }

    @Override
    public void deleteRole(long roleId) {
        roleDao.deleteRole(roleId); ;
    }

    @Override
    public RoleDto updateRole(RoleDto roleDto, long roleId) {
        return roleMapper.mapToDto(roleDao.updateRole(roleMapper.mapToEntity(roleDto),roleId));
    }

}
