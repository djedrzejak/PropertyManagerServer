package pl.propertymanager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.propertymanager.entity.Address;
import pl.propertymanager.entity.Property;
import pl.propertymanager.repository.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository addressRepository;

	public AddressService(AddressRepository addressRepository) {
		this.addressRepository = addressRepository;
	}
	
	
	public Optional<Address> findById(Long index){
		return addressRepository.findById(index);
	}
	
	public List<Address> findAll(){
		return addressRepository.findAll();
	}
	
	public Address save(Address address) {
		return addressRepository.save(address);
	}
	
	public void deleteById(Long id) {
		addressRepository.deleteById(id);
	}
	
	

}
