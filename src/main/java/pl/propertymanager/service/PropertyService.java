package pl.propertymanager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.propertymanager.entity.Property;
import pl.propertymanager.repository.PropertyRepository;

@Service
public class PropertyService {
	
	@Autowired
	private PropertyRepository propertyRepository;

	public PropertyService(PropertyRepository propertyRepository) {
		this.propertyRepository = propertyRepository;
	}
	
	
	public Optional<Property> findById(Long index) {
		return propertyRepository.findById(index);
	}
	
	public List<Property> findAll() {
		return propertyRepository.findAll();
	}
	
	public Property save(Property property) {
		return propertyRepository.save(property);
	}
	
	public void deleteById(Long id) {
		propertyRepository.deleteById(id);
	}
	
	
	
	

}
