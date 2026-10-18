package com.example.ConstructionManagementSystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ConstructionManagementSystem.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

	User getByEmail(String email);
	User findByEmail(String email);


	User findByEmailAndPassword(String email, String password);
}
