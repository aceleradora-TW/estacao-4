package com.example.loja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping(path = "/")
    public String index(){
        return "index";
    }


    @GetMapping(path = "cliente")
        public String cliente(){
            return  "cliente";
    }
}
