package com.jaynius.psvm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jaynius.psvm.model.Users;
import com.jaynius.psvm.service.UsersService;

@RestController
public class UsersController {
    
    @Autowired
    private final UsersService service;

    public UsersController(UsersService service) {
        this.service = service;
    }
    
    @PostMapping("/users/newUser")
    public ResponseEntity<Users> addUser(@RequestBody Users user){
        return service.addUsers(user);
    }

    @GetMapping("/users/user/{idNumber}")
    public ResponseEntity<Users> getUserById(@PathVariable String idNumber){
        return service.getUsersById(idNumber);
    }

    @GetMapping("/users")
    public ResponseEntity<List<Users>> getAllUsers(){
        return service.getAllUsers();
    }

    @PostMapping("/users/update/{idnumber}")
    public ResponseEntity<Users> updateUsersById(@RequestBody Users user, @PathVariable String idNumber){
        return service.updateById(user, idNumber);
    }

    @DeleteMapping("/users/delete/{idNumber}")
    public ResponseEntity<Users> deleteById(@PathVariable String idNumber){
        return service.deleteUserById(idNumber);
    }
}
