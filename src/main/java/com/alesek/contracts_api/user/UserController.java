package com.alesek.contracts_api.user;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    @PostMapping("")
    public UserDto createUser(@RequestBody UserDto userDto){
        return userService.createUser(userDto);
    }

    @PatchMapping("/{userUuid}")
    public UserDto editUser(@PathVariable UUID userUuid, @RequestBody UserDto userDto){
        return userService.editUser(userUuid, userDto);
    }

    @DeleteMapping("/{userUuid}")
    public void deleteUser(@PathVariable UUID userUuid){
        userService.deleteUser(userUuid);
    }

}
