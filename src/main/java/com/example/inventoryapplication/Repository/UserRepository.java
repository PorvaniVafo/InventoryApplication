package com.example.inventoryapplication.Repository;

import com.example.inventoryapplication.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

