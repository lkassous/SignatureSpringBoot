package com.leith.emails.service;

import java.util.List;

import com.leith.emails.entities.Role;
import com.leith.emails.entities.User;

public interface UserService {
	User saveUser(User user);

	User findUserByUsername(String username);

	Role addRole(Role role);

	User addRoleToUser(String username, String rolename);
	List<User> findAllUsers();

}
