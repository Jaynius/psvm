package com.jaynius.psvm.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jaynius.psvm.model.Users;

@Service
public interface UsersService {
    public ResponseEntity<Users> addUsers(Users newUser);
    public ResponseEntity<Users> getUsersById(String idNumber);
    public ResponseEntity<Users> updateById(Users user,String idNumber);
    public ResponseEntity<List<Users>> getAllUsers();
    public ResponseEntity<Users> deleteUserById(String idNumber);
    
}
