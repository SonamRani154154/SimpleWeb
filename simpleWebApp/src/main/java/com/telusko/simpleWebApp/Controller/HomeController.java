package com.telusko.simpleWebApp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
     public String  greet(){
         return "Hello";
     }

     @RequestMapping("/about")
    public  String about(){
        return "lets explore the modern generation ";
     }
}


