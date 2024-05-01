package Pegas.lection4.controller;

import Pegas.lection4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ThymeleafController {
    @Autowired
    private UserService userService;

    @GetMapping("/greeting")
    public String start(Model model){
        model.addAttribute("message", "hello");
        return "greeting";
    }

    @GetMapping("/users")
    public String listUsers(Model model){
        model.addAttribute("users", userService.getAllUsers());
        return "users";
    }

    @GetMapping("/users/{id}")
    public String getUser(@PathVariable Long id, Model model){
        model.addAttribute("user", userService.getUserById(id));
        return "userProfile";
    }
}
