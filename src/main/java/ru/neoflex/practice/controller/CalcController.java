package ru.neoflex.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController{

    @GetMapping("/plus/{a}/{b}")
    public int Sum(@PathVariable("a") int a, @PathVariable("b") int b){
        return a + b;
    }

    @GetMapping("/minus/{a}/{b}")
    public int Dis(@PathVariable("a") int a, @PathVariable("b") int b){
        return a - b;
    }

}