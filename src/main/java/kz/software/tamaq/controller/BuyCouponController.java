package kz.software.tamaq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/buyCoupon")
public class BuyCouponController {
    @GetMapping("/")
    public String buyCoupon() {
        return "buyCoupon";
    }
}