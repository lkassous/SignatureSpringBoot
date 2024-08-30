package com.leith.emails.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leith.emails.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);

}
