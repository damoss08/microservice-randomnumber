package com.springboot.web.application.randomnumberpicker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RandomNumberController {
    @RequestMapping("/randomdashboard")
    public String randomdashboard(){
    	System.out.println("In the Random Dashboard Controller");
        return "randomdashboard";
    }
}
