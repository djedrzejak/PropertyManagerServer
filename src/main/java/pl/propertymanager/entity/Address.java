package pl.propertymanager.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "property_generator")
	@SequenceGenerator(name = "property_generator", sequenceName = "property_seq")
	private Long id;
	
	
	@OneToOne(mappedBy = "address", cascade = CascadeType.ALL,
			fetch = FetchType.LAZY, optional = false)
	private Property property; 
	
	@OneToOne(mappedBy = "address", cascade = CascadeType.ALL,
			fetch = FetchType.LAZY, optional = false)
	private User user;
	
	@Column
	private String street;
	
	@Column
	private String postcode;
	
	@Column
	private String city;
	
	@Column
	private boolean parking;
	
}
