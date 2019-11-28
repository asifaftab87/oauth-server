package org.liferayasif.oauth.server.repository;

import java.util.Optional;

import org.liferayasif.oauth.server.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	Optional<User> findByEmail(String email);
}
