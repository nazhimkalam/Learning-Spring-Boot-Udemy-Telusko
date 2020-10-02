package com.nazhim.demo;

//  Data Access Object (DAO)

import com.nazhim.demo.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlienRepo extends JpaRepository<Alien, Integer> {

}