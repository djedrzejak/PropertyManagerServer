package pl.propertymanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.propertymanager.entity.Property;
import pl.propertymanager.repository.PropertyRepository;

@RestController
@RequestMapping("/properties")
public class PropertyController {

	@Autowired
	private PropertyRepository propertyRepository;
	
	@GetMapping
	public List<Property> getAll() {
		return propertyRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Property> findOne(@PathVariable Long id) {
		return propertyRepository.findById(id)
				.map(ResponseEntity::ok)
				.orElseGet(() -> ResponseEntity.notFound().build());
	}
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public void save(@RequestBody Property property) {
		propertyRepository.save(property);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		propertyRepository.deleteById(id);
	}
}
