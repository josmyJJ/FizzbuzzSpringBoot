package com.example.fizzbuzz2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.ArrayList;

@Controller
public class HomeControler {

    @GetMapping("/")
    public String fizzForm(Model model){
        model.addAttribute("fizzBuzz", new FizzBuzz());
        return "home";
    }

    @PostMapping("/process")
    public String processFizz(@Valid @ModelAttribute("fizzBuzz") FizzBuzz fizzBuzz, BindingResult result,
                              Model model){
        if(result.hasErrors()){
            return "home";
        }

//        ArrayList<String> arrResult = new ArrayList<>(); // ???
//        arrResult = fizzBuzz.fizzBuzzNums();
//        model.addAttribute("fizzBuzz", arrResult);
        model.addAttribute("outputs", fizzBuzz.fizzBuzzNums());
        return "list";
    }
}
