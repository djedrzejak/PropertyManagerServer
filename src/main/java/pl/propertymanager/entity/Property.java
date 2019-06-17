package pl.propertymanager.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="property")
public class Property {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "property_generator")
	@SequenceGenerator(name = "property_generator", sequenceName = "property_seq")
	private Long id;
	
	@Column
	private String name;

	
	//relacja wiele do jednego do usera
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="id_user")
	private User user;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_address")
	private Address address;
	

	public Property() { }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Property [id=" + id + ", name=" + name + "]";
	}

}
