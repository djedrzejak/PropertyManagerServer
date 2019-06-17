package pl.propertymanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.propertymanager.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
