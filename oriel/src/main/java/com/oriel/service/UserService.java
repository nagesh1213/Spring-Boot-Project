package com.oriel.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.oriel.model.Role;
import com.oriel.model.User;
import com.oriel.repository.RoleRepository;
import com.oriel.repository.UserRepository;

import java.util.Arrays;
import java.util.HashSet;

//@Service("userService")
public class UserService {

	/*
	 * private UserRepository userRepository; private RoleRepository roleRepository;
	 * private BCryptPasswordEncoder bCryptPasswordEncoder;
	 * 
	 * @Autowired public UserService(UserRepository userRepository, RoleRepository
	 * roleRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
	 * this.userRepository = userRepository; this.roleRepository = roleRepository;
	 * this.bCryptPasswordEncoder = bCryptPasswordEncoder; }
	 * 
	 * public User findUserByEmail(String email) { return
	 * userRepository.findByEmail(email); }
	 * 
	 * public User saveUser(User user) {
	 * user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
	 * user.setActive(1); Role userRole = roleRepository.findByRole("ADMIN");
	 * user.setRoles(new HashSet<Role>(Arrays.asList(userRole))); return
	 * userRepository.save(user); }
	 */

}