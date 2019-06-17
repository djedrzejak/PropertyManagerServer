package pl.propertymanager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import pl.propertymanager.entity.User;
import pl.propertymanager.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public Optional<User> findById(Long index){
		return userRepository.findById(index);
	}
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User save(User user) {
		return userRepository.save(user);
	}
	
	public void deleteById(Long id) {
		userRepository.deleteById(id);
	}
	
	
	
	

}
