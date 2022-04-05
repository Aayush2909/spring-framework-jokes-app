package com.springframework.springframeworkjokesapp.implementations;

import com.springframework.springframeworkjokesapp.services.JokeService;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl extends ChuckNorrisQuotes implements JokeService {

    String joke;

    @Override
    public String getJoke() {
        return this.joke = getRandomQuote();
    }
}
