package pl.propertymanager.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pl.propertymanager.entity.Property;
import pl.propertymanager.service.PropertyService;

@RestController
@RequestMapping("/properties")
public class PropertyController {

	@Autowired
	private PropertyService propertyService;
	
	@GetMapping("/all")
	public Iterable<Property> getAll() {
		return propertyService.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Property> findOne(@PathVariable Long id) {
		return propertyService.findById(id);
				
	}
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public void save(@RequestBody Property property) {
		propertyService.save(property);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		propertyService.deleteById(id);
	}
}
