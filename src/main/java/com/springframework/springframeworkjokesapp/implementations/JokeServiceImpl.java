package com.springframework.springframeworkjokesapp.implementations;

import com.springframework.springframeworkjokesapp.services.JokeService;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class JokeServiceImpl extends ChuckNorrisQuotes implements JokeService {

    @Override
    public String getJoke() {
        return getRandomQuote();
    }
}
