package com.nazhimkalam.demo2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home()
    {
        return "index";
    }

    @RequestMapping("add")
    public String addition(@RequestParam("num1") int firstNumber, @RequestParam("num2") int secondNumber, Model m)
    {
        int total = firstNumber + secondNumber;
        m.addAttribute("total", total);

        return "result";
    }

}
