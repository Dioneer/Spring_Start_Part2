package Pegas.seminar7.example7_1.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpController {
    @GetMapping("/helloRestSecurity")
    public String hell(){
        return "Hello, user!";
    }
}
