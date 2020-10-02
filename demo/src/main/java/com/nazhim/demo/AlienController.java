package com.nazhim.demo;

import com.nazhim.demo.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AlienController {

    @Autowired
    AlienRepo repo;

    @GetMapping("aliens")
    @ResponseBody
    public List<Alien> getAliens()
    {
        List<Alien> aliens = repo.findAll();

        return aliens;
    }

    @GetMapping("alien/{id}")
    @ResponseBody
    public Alien getAlien(@PathVariable("id") int aid)
    {
        // if alien not present then we send a new alien with values 0 and empty string.
        Alien alien = repo.findById(aid).orElse(new Alien(0, ""));

        return alien;
    }
}
