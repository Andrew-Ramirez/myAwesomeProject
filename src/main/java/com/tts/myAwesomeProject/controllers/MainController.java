package com.tts.myAwesomeProject.controllers;

import com.tts.myAwesomeProject.GreetingRepository;
import com.tts.myAwesomeProject.handlingformsubmission.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//This was @RestController. Changed to just controller
@Controller
public class MainController {

    @RequestMapping("/")
    public String home() {
        return "home.html";
    }


    @Autowired
    private GreetingRepository repo;

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
        model.addAttribute("greeting", greeting);
        repo.save(greeting);
        return "result";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/pageOne")
    public String pageOne() {
        return "test.html";

    }
    @RequestMapping(method = RequestMethod.GET, value = "/pageTwo")
    public String pageTwo() {
        return "otherTest.html";
    }
}
