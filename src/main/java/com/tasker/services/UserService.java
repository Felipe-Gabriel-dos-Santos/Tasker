package com.tasker.services;

import java.time.LocalDateTime;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tasker.DTOS.UserDTO;
import com.tasker.entities.User;
import com.tasker.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ModelMapper modelMapper;


  public UserDTO create(User user)  {
    
    user.setCreatedAt(LocalDateTime.now());
    User savedUser = userRepository.save(user);

    return modelMapper.map(savedUser, UserDTO.class);
  }
  public UserDTO findByEmailAndPassword(String email, String password) {
    User user = userRepository.findByEmailAndPassword(email, password);

    if (user == null) return new UserDTO();

    return modelMapper.map(user, UserDTO.class);
  }
}