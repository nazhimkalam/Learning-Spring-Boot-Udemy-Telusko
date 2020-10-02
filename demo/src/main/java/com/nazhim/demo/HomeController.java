package com.nazhim.demo;

import com.nazhim.model.Alien;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

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
        List<Alien> aliens = Arrays.asList(new Alien(101, "Navin"), new Alien(102, "Rose"));
        m.addAttribute("result", aliens);
        return "showAliens";
    }



}
