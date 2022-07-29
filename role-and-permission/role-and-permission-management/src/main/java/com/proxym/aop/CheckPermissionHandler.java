package com.proxym.aop;

import com.proxym.entities.Role;
import com.proxym.role.permission.common.dto.PermissionDto;
import com.proxym.role.permission.common.dto.RoleDto;
import com.proxym.services.PermissionService;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Aspect
@Component
@RequiredArgsConstructor
public class CheckPermissionHandler {
    private  final  PermissionService permissionService;
    private final DummyRoleProvider dummyRoleProvider;
    @Before(" @annotation(checkPermission)")
    public void CheckPermissionService(CheckPermission checkPermission){
        PermissionDto permissionDto = permissionService.findByName(checkPermission.name());
        if (!permissionDto.isEnabled()){
            throw new RuntimeException("disabled permission");
        }
        RoleDto roleDto =dummyRoleProvider.create();
        Optional<PermissionDto> optionalPermissionDto= roleDto.getPermissionDtoList()
                .stream().filter(permission -> permission.getName().equals(checkPermission.name())).findFirst();
        if (!optionalPermissionDto.isPresent())
        {
            throw new RuntimeException("do you not have access ");
        }

    }

}
