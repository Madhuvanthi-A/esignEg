package com.certificate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.certificate.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User findUserByEmail(String email);
	
}
