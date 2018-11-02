package com.codeup.springblog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {
    @RequestMapping(path = "/add/{number}/and/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String add(@PathVariable Long number, @PathVariable Long number2) {
        return "Your total is: " + (number  + number2) + "!";
    }

    @RequestMapping(path = "/subtract/{number}/from/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String subtract(@PathVariable Long number, @PathVariable Long number2) {
        return "Your total is: " + (number - number2) + "!";
    }
    @RequestMapping(path = "/multiply/{number}/and/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String multiply(@PathVariable Long number, @PathVariable Long number2) {
        return "Your total is: " + (number * number2) + "!";
    }
    @RequestMapping(path = "/divide/{number}/by/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String divide(@PathVariable Long number, @PathVariable Long number2) {
        return "Your total is: " + (number / number2) + "!";
    }
}

