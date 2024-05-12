package Pegas.seminar7.example7_4.controller;

import Pegas.seminar7.example7_4.service.HomeService;
import Pegas.seminar7.example7_4.service.UserService7;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import Pegas.seminar7.example7_4.service.AdminService;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final HomeService homeService;
    private final UserService7 userService7;
    private final AdminService adminService;

    @GetMapping("/qw")
    public String home(Model model) {
        model.addAttribute("text", homeService.getText());
        return "index";
    }

    @GetMapping("/qwwe")
    public String index() {
        return "redirect:/";
    }

    @GetMapping("/qwwwe")
    public String user(Model model) {
        model.addAttribute("text", userService7.getText());
        return "user";
    }

    @GetMapping("/admin")
    public String admin(Model model) {
        model.addAttribute("text", adminService.getText());
        return "admin";
    }
}