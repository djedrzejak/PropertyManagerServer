package pl.propertymanager.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "property_generator")
	@SequenceGenerator(name = "property_generator", sequenceName = "property_seq")
	private Long id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_address")
	private Address address;
	
	@OneToMany(mappedBy = "user")
	private List<Property> property = new ArrayList<Property>();
	
	@OneToMany(mappedBy = "user")
	private List<Comment> comments = new ArrayList<Comment>();
	

	
	
	@Column
	private String name;
	
	@Column
	private String surname;
	
	
	
	
}
