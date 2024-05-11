package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MovieController {

    @Autowired private MovieService movieService;

    @RequestMapping("/movie/{id}")
    public MovieDto movie(@PathVariable long id) {
        return movieService.findById(id);
    }
}
