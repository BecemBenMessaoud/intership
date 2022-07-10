package com.proxym.dao;

import com.proxym.entities.Permission;
import com.proxym.repositories.PermissionRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;


@Repository
public class PermissionDaoImpl implements PermissionDao{
    private final PermissionRepository permissionRepository;

    public PermissionDaoImpl(PermissionRepository permissionRepository){
        this.permissionRepository=permissionRepository;

    }

    @Override
    public Permission addPermission(Permission p) {
        return permissionRepository.save(p);
    }

    @Override
    public List<Permission> selectAllPermission(){

        return permissionRepository.findAll();

    }

    @Override
    public List<Permission> addAllPermission(List Permission) {
        return permissionRepository.saveAll(Permission);
    }

    @Override
    public Permission enablePermission(Long id) {
     Optional<Permission> permission = permissionRepository.findById(id);
      if (permission.get().isEnabled()) {
          return permission.get() ;
    }
        return null;
    }
    @Override
    public Permission disablePermission(Long id) {
        Optional<Permission> permission = permissionRepository.findById(id);
        if (!(permission.get().isEnabled())) {
            return permission.get() ;
        }
        return null;
    }
    @Override
    public List<Permission> findEnabledList() {
        return permissionRepository.findByEnabledIsTrue();
    }
}
