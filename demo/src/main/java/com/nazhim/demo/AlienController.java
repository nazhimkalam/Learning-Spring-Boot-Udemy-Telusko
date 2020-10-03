package com.nazhim.demo;

import com.nazhim.demo.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlienController {

    @Autowired
    AlienRepo repo;

    @GetMapping("aliens")
    public List<Alien> getAliens()
    {
        List<Alien> aliens = repo.findAll();

        return aliens;
    }

    @GetMapping("alien/{id}")
    public Alien getAlien(@PathVariable("id") int aid)
    {
        // if alien not present then we send a new alien with values 0 and empty string.
        Alien alien = repo.findById(aid).orElse(new Alien(0, ""));

        return alien;
    }

    // consumes says that it only accepts the json data from the client
    @PostMapping(path = "alien", consumes = {"application/json"})
    public Alien addAlien(@RequestBody Alien alien)
    {
        repo.save(alien);
        return alien;
    }
}
