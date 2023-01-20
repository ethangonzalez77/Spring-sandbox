package com.codeup.springsandbox;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    //🧇1. need a controller method to show the initial html form
    // need a controller method to process the html form
    //basically need two methods for building this




    //🧇2.//need a controller method to show the initial HTML form
    @GetMapping("/showForm")
    public String showform () {
        return "helloworld-form";
    }

    //🧇4. where the html form is going to send the data. need a controller method to process the html form
    @GetMapping("/processForm")
    public String processForm(Model model, @RequestParam String studentName) {
        model.addAttribute("studentName", studentName);
        return "helloworld";
    }


    @GetMapping("/processFormVersionTwo")
    public String letsShoutDude (HttpServletRequest req , Model model) {

        //read the request parameter from  the HTML form
        String theName = req.getParameter("studentName");

        //convert the data to all caps
        theName = theName.toUpperCase();

        //create the message
        String result = "Yo!" + theName;

        //add message to the model
        model.addAttribute("message", result);


        return "helloworld";
    }






//
//    @PostMapping("/processForm")
//    public String joinCohort(@RequestParam(name = "cohort") String cohort, Model model) {
//        model.addAttribute("cohort", "Welcome to " + cohort + "!");
//        return "join";
//    }













}
