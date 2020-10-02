package com.nazhim.demo;

import com.nazhim.demo.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class HomeController {

    @Autowired
    AlienRepo repo;

    // All the ModelAttributes will be called first before calling the RequestMapping deco
    @ModelAttribute
    public void modelData(Model m){
        m.addAttribute("name", "Aliens");
    }

    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @PostMapping("addAlien")
    public String add(@ModelAttribute("a1")Alien a)
    {
        return "result";
    }

    @GetMapping("getAliens")
    public String getAliens(Model m)
    {
        m.addAttribute("result", repo.findAll());
        return "showAliens";
    }



}
