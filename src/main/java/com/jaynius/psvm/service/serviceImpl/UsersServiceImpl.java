package com.jaynius.psvm.service.serviceImpl;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.jaynius.psvm.model.Users;
import com.jaynius.psvm.service.UsersService;

@Component
public class UsersServiceImpl implements UsersService {

    @Override
    public ResponseEntity<Users> addUsers(Users newUser) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addUsers'");
    }

    @Override
    public ResponseEntity<Users> getUsersById(String idNumber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUsersById'");
    }

    @Override
    public ResponseEntity<Users> updateById(Users user, String idNumber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateById'");
    }

    @Override
    public ResponseEntity<List<Users>> getAllUsers() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllUsers'");
    }

    @Override
    public ResponseEntity<Users> deleteUserById(String idNumber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUserById'");
    }
    
}
