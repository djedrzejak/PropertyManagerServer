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

import pl.propertymanager.entity.Address;
import pl.propertymanager.service.AddressService;

@Controller
@RequestMapping("/address")
public class AddressController {

	
	@Autowired
	private AddressService addressService;
	

	@GetMapping("/all")
	public List<Address> getAll() {
		return addressService.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Address> findOne(@PathVariable Long id) {
		return addressService.findById(id);
				
	}
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public void save(@RequestBody Address address) {
		addressService.save(address);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		addressService.deleteById(id);
	}
	
}
