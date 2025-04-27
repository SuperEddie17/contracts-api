package com.alesek.contracts_api.user;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserDto createUser(UserDto userDto){
        UserEntity userEntity = userMapper.toEntity(userDto);
        userRepository.save(userEntity);
        return userMapper.toDto(userEntity);
    }

    public UserDto editUser(UUID userUuid,UserDto userDto){

        UserEntity user = userRepository.findByUuid(userUuid).orElseThrow(() -> new RuntimeException("User not found"));
       userMapper.updateEntity(userDto, user);
        userRepository.save(user);
        return userMapper.toDto(user);
    }

    public void deleteUser(UUID userUuid){
        UserEntity user = userRepository.findByUuid(userUuid).orElseThrow(() -> new RuntimeException("User not found"));
        userRepository.delete(user);
    }

    public UserDto getUser(UUID userUuid){
        UserEntity user = userRepository.findByUuid(userUuid).orElseThrow(() -> new RuntimeException("User not found"));
        return userMapper.toDto(user);
    }


}
