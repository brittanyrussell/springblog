package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class rollDice {
    @GetMapping("/roll-dice")
    @ResponseBody
    public String rollDice() {
//        return "Please guess a number between 1 and 6 ";
        return "What is your guess?<br/><ul>" +
                "<li><a href='/roll-dice/1'>1</a></li>" +
                "<li><a href='/roll-dice/2'>2</a></li>" +
                "<li><a href='/roll-dice/3'>3</a></li>" +
                "<li><a href='/roll-dice/4'>4</a></li>" +
                "<li><a href='/roll-dice/5'>5</a></li>" +
                "<li><a href='/roll-dice/6'>6</a></li>" +
                "</ul>";

    }

    @GetMapping("/roll-dice/{n}")
    @ResponseBody
    public String checkGuess(@PathVariable Integer n ) {
        Integer diceRoll = new Random().nextInt(6) + 1;
        if (n == diceRoll) {
            return "<h2>You got it!</h2>";
        } else
            return "Sorry, the number rolled was " + diceRoll.toString();

    }

//    @GetMapping("/roll-dice/{n}")
//    @ResponseBody
//    public String randomPick(@PathVariable int n ) {
//        Random rand = new Random();
//        int x = rand.nextInt(6 - 1);
//        if (n == x) {
//            return "You guessed it correctly!";
//        } else {
//            return "OOPS wrong!! It was " + x;
//
//        }
//    }
}
