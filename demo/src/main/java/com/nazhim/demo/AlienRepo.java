package com.nazhim.demo;

//  Data Access Object (DAO)

import com.nazhim.demo.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AlienRepo extends JpaRepository<Alien, Integer> {

    List<Alien> findByAname(String aname);   // this method acts like a Query which is handled by the JPA

    // we also can make our own queries than using the JPA method way.
    // @Query("from Alien where aname= :name")
    // List<Alien> find(@Param("name") String aname);
}