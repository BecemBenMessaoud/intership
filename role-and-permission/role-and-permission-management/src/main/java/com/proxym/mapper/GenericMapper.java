package com.proxym.mapper;

import java.util.List;
import java.util.stream.Collectors;

public abstract class GenericMapper <E,D> {
    abstract  D mapToDto (E e);
    abstract E mapToEntity(D d);

    public List<D> mapToDtoList(List<E> entityList){
         return entityList.stream().map(this::mapToDto).collect(Collectors.toList());
    }

    public List<E> mapToEntityList(List<D> dtoList){
        return dtoList.stream().map(dto -> mapToEntity(dto)).collect(Collectors.toList());
    }


}
