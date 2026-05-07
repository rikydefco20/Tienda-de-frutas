package com.frutas.tienda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {

        List<String> frutas = List.of(
                "Manzana",
                "Banana",
                "Naranja",
                "Fresa",
                "Piña",
                "Sandía"
        );

        model.addAttribute("frutas", frutas);

        return "index";
    }
}
