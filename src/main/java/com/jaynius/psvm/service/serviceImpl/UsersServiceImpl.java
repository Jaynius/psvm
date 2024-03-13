package com.jaynius.psvm.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.jaynius.psvm.model.Users;
import com.jaynius.psvm.repository.UsersRepository;
import com.jaynius.psvm.service.UsersService;

@Component
public class UsersServiceImpl implements UsersService {
    @Autowired
    private final UsersRepository repository;
    

    public UsersServiceImpl(UsersRepository repository) {
        this.repository = repository;
    }

    @Override
    public ResponseEntity<Users> addUsers(Users newUser) {
        Users user=repository.save(newUser);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Users> getUsersById(String idNumber) {
        
        @SuppressWarnings("null")
        Optional<Users> user=repository.findById(idNumber);
        if(user.isPresent()){
            return new ResponseEntity<>(user.get(),HttpStatus.FOUND);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @Override
    public ResponseEntity<Users> updateById(Users user, String idNumber) {
        Optional<Users> existingUser=repository.findById(idNumber);
        if(existingUser.isPresent()){
            Users updatedUser=existingUser.get();
            updatedUser.setFirstName(user.getFirstName());
            updatedUser.setLastName(user.getLastName());
            updatedUser.setEmail(user.getEmail());
            updatedUser.setContacts(user.getContacts());

            Users userObj=repository.save(updatedUser);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @Override
    public ResponseEntity<List<Users>> getAllUsers() {
        List<Users> userList=new ArrayList<>();
        repository.findAll().forEach(userList::add);
        if(userList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(userList,HttpStatus.OK);
        
    }

    @Override
    public ResponseEntity<Users> deleteUserById(String idNumber) {
        
        Optional<Users> user=repository.findById(idNumber);
        if(user.isPresent()){
            repository.deleteById(idNumber);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
}
