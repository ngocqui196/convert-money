package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

    @GetMapping("/")
    public String convert() {
        return "index";
    }

    @PostMapping("/ok")
    public String result(@RequestParam String usd, Model model) {
        double USD = Double.parseDouble(usd);
//        double RATE = Double.parseDouble(rate);

        double result = USD * 23000;
        model.addAttribute("result",result);
        return "index";
    }


}
