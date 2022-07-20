package com.proxym.components;

import com.proxym.role.permission.common.dto.PermissionDto;
import com.proxym.role.permission.common.interfaces.PermissionDefinition;
import com.proxym.services.PermissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class PermissionScanner implements CommandLineRunner {
    private final ApplicationContext applicationContext;
    private final PermissionService permissionService;
    @Override
    public void run(String... args) throws Exception {
        Map<String,PermissionDefinition> permissionDefinitionMap =applicationContext.getBeansOfType(PermissionDefinition.class);
        List<PermissionDto> permissionDtoDefinitions= permissionDefinitionMap.values().stream()
                .map(PermissionDefinition::create).collect(Collectors.toList());
        List<PermissionDto> permissionDtoList =permissionService.getAllPermission();
        List<PermissionDto> toAdd = new ArrayList<>();
        permissionDtoDefinitions.forEach(permissionDto -> {
            if (findByNameAndCategory(permissionDtoList,permissionDto.getName(),permissionDto.getCategory()) == null){
                toAdd.add(permissionDto);
            }
        });
        permissionService.addAllPermission(toAdd);

        List<PermissionDto> toDelete = new ArrayList<>();
        permissionDtoList.forEach(permissionDto -> {
            if (findByNameAndCategory(permissionDtoDefinitions,permissionDto.getName(),permissionDto.getCategory()) == null){
                toDelete.add(permissionDto);
            }
        });
        permissionService.deleteAllPermission(toDelete);

        //add mission permission to database
        //delete necessary permission from database
    }
    private PermissionDto findByNameAndCategory(List<PermissionDto> permissionDtoList,String name,String category){
        return permissionDtoList.stream()
                .filter(permissionDto -> permissionDto.getCategory().equals(category))
                .filter(permissionDto -> permissionDto.getName().equals(name))
                .findFirst().orElse(null);
    }
}
