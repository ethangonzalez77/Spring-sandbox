package com.codeup.springsandbox;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    //🧇1. need a controller method to show the initial html form
    // need a controller method to process the html form
    //basically need two methods for building this


    //🧇2.
    @GetMapping("/showForm")
    public String showform () {
        return "helloworld-form";
    }

    //🧇4. where the html form is going to send the data
    @GetMapping("/processForm")
    public String processForm(Model model, @RequestParam String poop) {
        model.addAttribute("pew", poop);
        return "helloworld";
    }




//
//    @PostMapping("/processForm")
//    public String joinCohort(@RequestParam(name = "cohort") String cohort, Model model) {
//        model.addAttribute("cohort", "Welcome to " + cohort + "!");
//        return "join";
//    }













}
