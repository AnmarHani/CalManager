package com.calmanager.auth.calmanager_auth.mapper;

import com.calmanager.auth.calmanager_auth.dto.UserDto;
import com.calmanager.auth.calmanager_auth.entity.User;

public class UserMapper {
    public static UserDto mapToUserDto(User user) {
        return new UserDto(
            user.getId(),
            user.getName(),
            user.getEmail(),
            user.getPassword(),
            user.getType(),
            user.getRoleId()
        );
    }

    public static User maptoUser(UserDto userDto) {
        return new User(
            userDto.getId(),
            userDto.getName(),
            userDto.getEmail(),
            userDto.getPassword(),
            userDto.getType(),
            userDto.getRoleId()
        );
    }
}
