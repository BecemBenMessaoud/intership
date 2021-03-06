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
      if (!permission.isPresent()) {
          throw new RuntimeException("didn't exist permission");
    }
        permission.get().setEnabled(true); ;
        return permissionRepository.save(permission.get());
    }
    @Override
    public Permission disablePermission(Long id) {
        Optional<Permission> permission = permissionRepository.findById(id);
        if(!permission.isPresent()){
            throw new RuntimeException("didn't exist permission");
        }
        permission.get().setEnabled(false);
        return permissionRepository.save(permission.get());
    }
    @Override
    public List<Permission> findEnabledList() {
        return permissionRepository.findByEnabledIsTrue();
    }

    @Override
    public List<Permission> deleteAllPermission(List<Permission> permissionList) {
        permissionRepository.deleteAll(permissionList);
        return permissionList;
    }

    @Override
    public Permission findByName(String name) {
        return permissionRepository.findByName(name);
    }
}
