package com.proxym.controllers;

import com.proxym.aop.CheckPermission;
import com.proxym.role.permission.common.dto.EnabledPermissionDto;
import com.proxym.role.permission.common.dto.PermissionDto;
import com.proxym.services.PermissionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("permission-management")
@RequestMapping("permission-management")
public class PermissionController {
    private final PermissionService permissionService;

    public PermissionController(PermissionService permissionService) {
        this.permissionService = permissionService;
    }

    @CheckPermission(name="DISPLAY_PERMISSION")
    @GetMapping("/all")
    public List<PermissionDto> getAllPermission() {
        return permissionService.getAllPermission();
    }
    @PostMapping("/enable/{id}")
    public PermissionDto enablePermission(@PathVariable Long id ) {
        return permissionService.enablePermission(id);

    }
    @PostMapping("/disable/{id}")
    public PermissionDto disablePermission(@PathVariable Long id) {

        return permissionService.disablePermission(id);
    }
    @GetMapping("/enabled/all")
    public ResponseEntity<List<EnabledPermissionDto>> findEnabledPermissions (){
        return ResponseEntity.ok(permissionService.findEnabled());
    }
}
