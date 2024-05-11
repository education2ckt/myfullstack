package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MovieServiceJPA implements MovieService{
    @Autowired
    private MovieRepository repository;

    @Override
    public MovieDto findById(long idx) {
        return  new MovieDto(repository.findById(idx).get());
    }


}
