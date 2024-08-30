package com.leith.emails.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leith.emails.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
		Role findByRole(String role);


}
