package com.calmanager.auth.calmanager_auth.service.implementation;

import org.springframework.stereotype.Service;

import com.calmanager.auth.calmanager_auth.dto.UserDto;
import com.calmanager.auth.calmanager_auth.entity.User;
import com.calmanager.auth.calmanager_auth.mapper.UserMapper;
import com.calmanager.auth.calmanager_auth.repository.UserRepository;
import com.calmanager.auth.calmanager_auth.service.UserService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = UserMapper.maptoUser(userDto);
        User savedUser = userRepository.save(user);

        UserDto savedUserDto = UserMapper.mapToUserDto(savedUser);
        return savedUserDto;
    }
    
}
