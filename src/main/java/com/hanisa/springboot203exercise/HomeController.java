package com.hanisa.springboot203exercise;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class javaex {
    @Controller
    public class HomeController{
        @GetMapping("/songform")
        public String loadFormPage(Model model){
            model.addAttribute("song",new Song());
            return "confirmsong";
        }

    }