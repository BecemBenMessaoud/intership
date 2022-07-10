package com.proxym.controllers;

import com.proxym.dto.EnabledPermissionDto;
import com.proxym.dto.PermissionDto;
import com.proxym.services.PermissionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("permission-management")
public class Controller {
    private final PermissionService permissionService;

    public Controller(PermissionService permissionService) {
        this.permissionService = permissionService;
    }

    @PostMapping("/add")
    PermissionDto addPermission(@RequestBody PermissionDto permissionDto) {
        return permissionService.addPermission(permissionDto);
    }
    @PostMapping("/addAll")
    List<PermissionDto> addAllPermission(@RequestBody List<PermissionDto> permissionDto) {
        return permissionService.addAllPermission(permissionDto);
    }

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
