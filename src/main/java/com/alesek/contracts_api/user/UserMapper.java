package com.alesek.contracts_api.user;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(UserEntity source);

    UserEntity toEntity(UserDto source);

    @Mapping(target = "id", ignore = true)
    void updateEntity(UserDto source, @MappingTarget UserEntity target);

}
