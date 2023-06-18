package kz.software.tamaq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/typeFood")
public class TypeFoodController {
    @GetMapping("/")
    public String specificFood() {
        return "typeFood";
    }
}

