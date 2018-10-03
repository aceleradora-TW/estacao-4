package com.example.loja.controllers;

import com.example.loja.models.Loja;
import com.example.loja.services.LojaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(path="loja")
public class LojaController {

    @Autowired
    private LojaService lojaService;

    @GetMapping
    public String lojas(Model model){
        model.addAttribute("lojas", lojaService.pegaTodasLojas());
        return "loja";
    }
}
