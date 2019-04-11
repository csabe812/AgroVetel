package com.agrovetel.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.agrovetel.domain.User;
import com.agrovetel.service.UserService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	private UserService userService;

	/**
	 * Setter-based autowiring
	 * 
	 * @param userService
	 */
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/index")
	public String showAdminSite() {
		log.debug("Loading admin site");
		return "admin";
	}

	/**
	 * List of the users
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/users")
	public String showUsers(Model model) {
		log.info("Getting users");
		model.addAttribute("users", this.userService.findAll());
		return "users";
	}

	@GetMapping("/users/{id}")
	public String editUser(@PathVariable long id, Model model) {
		log.info("Getting a user by id");
		model.addAttribute("user", this.userService.findById(id));
		return "user";
	}
	
	@GetMapping("/users/{id}/update")
	public String updateUser(@PathVariable long id, @Valid User updatedUser) {
		log.info("Updating user");
		this.userService.updateUser(id, updatedUser);
		return "users";
	}
	
	/**
	 * Deletes a user
	 * @param id
	 * @return
	 */
	@GetMapping("/users/{id}/delete")
	public String deleteUser(@PathVariable long id) {
		log.info("started");
		this.userService.deleteById(id);
		return "users";
	}
}
