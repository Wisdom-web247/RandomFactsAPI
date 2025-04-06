package com.example.randomfactsapi.controller;

import com.example.randomfactsapi.services.FactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    @Autowired
    private FactService factService;

    @GetMapping("/view/facts")
    public String getFactsView(Model model) {
        model.addAttribute("facts", factService.getAllFacts());
        return "facts"; // This will resolve to facts.html
    }
}