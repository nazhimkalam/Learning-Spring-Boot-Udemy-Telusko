package com.nazhim.sercurity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Person, Integer> {

    Person findByUsername(String username);

}
