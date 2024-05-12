package Pegas.seminar7.example7_1.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/helloWebSecurity")
    public String startPage(){
        return "index";
    }
}
