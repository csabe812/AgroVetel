package com.agrovetel.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agrovetel.domain.User;
import com.agrovetel.repository.UserRepository;

@Service
public class UserService {
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	private UserRepository userRepository;

	@Autowired
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public List<User> findAll() {
		return this.userRepository.findAll();
	}
	
	/**
	 * Finding a user by its id
	 * @param id user id
	 * @return found user
	 */
	public User findById(long id) {
		return this.userRepository.findById(id);
	}
	
	/**
	 * Deletes a user
	 * @param id
	 */
	public void deleteById(long id) {
		this.userRepository.deleteById(id);
	}

	/**
	 * Updates a user
	 * @param updatedUser
	 */
	public void updateUser(long id, User updatedUser) {
		User user = this.userRepository.findById(id);
		log.info("User who will be updated: " + user.toString());
		log.info("Updated with: " + updatedUser.toString());
		user.setEmail(updatedUser.getEmail());
		user.setFullname(updatedUser.getFullname());
		this.userRepository.save(updatedUser);
	}

}
