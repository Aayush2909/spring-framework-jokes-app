package com.springframework.springframeworkjokesapp;

import com.springframework.springframeworkjokesapp.controllers.JokeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFrameworkJokesAppApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SpringFrameworkJokesAppApplication.class, args);

        JokeController jokeController = (JokeController) ctx.getBean("jokeController");
        System.out.println(jokeController.getRandomJoke());
    }

}
