package Pegas.seminar3.task2.rest;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello user";
    }

    @GetMapping("/chao")
    public String chao(){
        return "Chao user";
    }
}
