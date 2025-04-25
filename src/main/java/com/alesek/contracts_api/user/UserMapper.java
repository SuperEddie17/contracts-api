package com.alesek.contracts_api.user;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(UserEntity userEntity);

    UserEntity toEntity(UserDto userDto);

    @Mapping(target = "id", ignore = true)
    void updateEntity(UserDto dto, @MappingTarget UserEntity entity);

}
