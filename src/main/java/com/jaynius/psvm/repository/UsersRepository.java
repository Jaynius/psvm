package com.jaynius.psvm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jaynius.psvm.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users,String> {
    
}
