package com.nazhim.demo;

import com.nazhim.model.Alien;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

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

    @RequestMapping("addAlien")
    public String add(@ModelAttribute("a1")Alien a)
    {
        return "result";
    }



}
