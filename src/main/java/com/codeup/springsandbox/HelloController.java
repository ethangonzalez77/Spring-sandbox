package com.codeup.springsandbox;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/naruto")
    public String sayHello () {

        return "shippuden";//html file we are referring to

    }








}
