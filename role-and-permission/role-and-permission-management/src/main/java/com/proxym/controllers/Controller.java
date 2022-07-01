package com.proxym.controllers;

import com.proxym.dto.PermissionDto;
import com.proxym.services.PermissionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("permission-management")
public class Controller {
    private final PermissionService permissionService;

    public Controller(PermissionService permissionService) {
        this.permissionService = permissionService;
    }

    @PostMapping("/add")
    PermissionDto addPermission(PermissionDto permissionDto) {
        return permissionService.addPermission(permissionDto);
    }
    @PostMapping("/addAll")
    List<PermissionDto> addAllPermission(List<PermissionDto> permissionDto) {
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
    @PostMapping("/disable")
    public PermissionDto disablePermission(@PathVariable Long id) {
        return permissionService.disablePermission(id);
    }
}
