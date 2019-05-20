package pl.propertymanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.propertymanager.entity.Property;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Long>{

}
