package com.springframework.springframeworkjokesapp.controllers;

import com.springframework.springframeworkjokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    public String getRandomJoke() {
        return jokeService.getJoke();
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String getChuckNorrisJoke(Model model) {

        model.addAttribute("joke", getRandomJoke());

        return "joke/display";
    }
}
