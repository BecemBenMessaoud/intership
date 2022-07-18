package com.proxym.controllers;

import com.proxym.dto.RoleDto;
import com.proxym.services.RoleService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController("role-management")
@RequestMapping("role-management")

public class RoleController {
   private final RoleService roleService;
   public RoleController(RoleService roleService)
   {
       this.roleService=roleService;
   }
   @PostMapping("/add")
    RoleDto addRole(@RequestBody RoleDto roleDto){
       return roleService.addRole(roleDto);
   }
  @DeleteMapping("/delete/{roleId}")
    void deleteRole (@PathVariable long roleId){
       roleService.deleteRole(roleId);
   }
   @PutMapping("/update/{roleId}")
   RoleDto update(@RequestBody RoleDto roleDto,@PathVariable long roleId){
       return roleService.updateRole(roleDto,roleId);
   }
   @GetMapping("/getAllRoles")
    List<RoleDto> getAllRoles(){
       return roleService.getAllRoles();
   }
}
