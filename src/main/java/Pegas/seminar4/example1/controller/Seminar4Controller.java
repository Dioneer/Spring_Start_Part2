package Pegas.seminar4.example1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/about")
public class Seminar4Controller {

    @GetMapping
    public String getAbout(){
        return "about";
    }

}
