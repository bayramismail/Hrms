package Kodlama.Io.Hrms.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.Io.Hrms.business.abstracts.UserService;
import Kodlama.Io.Hrms.core.utilities.result.Result;
import Kodlama.Io.Hrms.entities.concretes.User;

@RestController
@RequestMapping("/api/users")
public class UsersController {

	private UserService userService;

	public UsersController(UserService userService) {
		this.userService = userService;
	}
	@PostMapping("add")
	private Result add(@RequestBody User user) {
		// TODO Auto-generated method stub
      return userService.add(user);
	}
}
