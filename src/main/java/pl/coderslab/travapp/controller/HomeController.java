package pl.coderslab.travapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    public String hello(){
        return "hello";
    }

    @RequestMapping("/get")
    public String get(){
        return "/get";
    }
}
