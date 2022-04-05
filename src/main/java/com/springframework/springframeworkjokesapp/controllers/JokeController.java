package com.springframework.springframeworkjokesapp.controllers;

import com.springframework.springframeworkjokesapp.services.JokeService;

public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    public String getRandomJoke() {
        return jokeService.getJoke();
    }
}
