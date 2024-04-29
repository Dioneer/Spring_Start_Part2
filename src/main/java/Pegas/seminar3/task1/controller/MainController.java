package Pegas.seminar3.task1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @GetMapping("/home")
    public String getHome(){
        return "home.html";
    }

    @GetMapping("/cats")
    public String getCats(){
        return "cats.html";
    }
    @GetMapping("/game")
    public String getGame(){
        return "game.html";
    }
}
