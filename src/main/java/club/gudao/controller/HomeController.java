package club.gudao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Author : GuDao
 * 2020/3/8
 */

@Controller
public class HomeController {
    @GetMapping("/")
    public String homePage(){
        return "index";
    }
}
