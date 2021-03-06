package com.agrovetel.repository;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.agrovetel.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserRepositoryTest {
	@Autowired
	private UserRepository userRepository;
	
	@Test
	public void testFindAllUsers() {
		List<User> ads = (List<User>) userRepository.findAll();
		assertNotNull(ads);
		assertTrue(!ads.isEmpty());
	}
	
	@Test
	public void testFindUserById1() {
		User user = userRepository.findById(1);
		assertNotNull(user);
	}
	
	@Test
	public void testFindAdById2() {
		User user = userRepository.findById(1);
		assert(user.getFullname().toLowerCase().equals("admin"));
		assert(user.getEmail().equals("admin"));
		assert(user.getEnabled());
		assert(user.getPassword().equals("$2a$10$5vO5XjervV.7h1KJE8XQSes5WQOnAyP0OS6LLMwpFA2tEV5OrZDA6"));
			
	}

}
