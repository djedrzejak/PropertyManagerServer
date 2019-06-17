package pl.propertymanager.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.propertymanager.entity.User;
import pl.propertymanager.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {



	@Autowired
	private UserService userService;
	

	@GetMapping("/all")
	public List<User> getAll() {
		return userService.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<User> findOne(@PathVariable Long id) {
		return userService.findById(id);
				
	}
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public void save(@RequestBody User user) {
		userService.save(user);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		userService.deleteById(id);
	}
	
}
