package com.nazhim.demo;

//  Data Access Object (DAO)

import com.nazhim.demo.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlienRepo extends JpaRepository<Alien, Integer> {

    List<Alien> findByAname(String aname);   // this method acts like a Query which is handled by the JPA
}