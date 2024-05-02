package Pegas.seminar4.example3.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Controller
public class RandomController {
    private final Random random = new Random();

    @GetMapping("/random")
    public String getRandom(Model model){
        model.addAttribute("random", random.nextInt(0,101));
        return "random";
    }
    @GetMapping("/random/{min}/{max}")
    public String getMinMaxRandom(Model model, @PathVariable(name = "min") int min, @PathVariable(name = "max") int max) {
        Random rnd = new Random();
        int num = rnd.nextInt(min, max);
        model.addAttribute("number",num);
        model.addAttribute("min",min);
        model.addAttribute("max",max);
        return "minMax";
    }

    @GetMapping("/randomPath")
    public String getPathRandom(Model model, @RequestParam(name = "min") int min, @RequestParam(name = "max") int max) {
        Random rnd = new Random();
        int num = rnd.nextInt(min, max);
        model.addAttribute("number",num);
        model.addAttribute("min",min);
        model.addAttribute("max",max);
        return "minMax";
    }

}
