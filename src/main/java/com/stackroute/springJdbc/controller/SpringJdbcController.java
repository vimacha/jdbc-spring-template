package com.stackroute.springJdbc.controller;

import com.stackroute.springJdbc.domain.Movie1;
import com.stackroute.springJdbc.repository.SpringJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SpringJdbcController {
    @Autowired
    private SpringJdbcRepository springJdbcRepository;

    public ResponseEntity<String> executeShow() {
        Movie1 entity = springJdbcRepository.get(2);
        return new ResponseEntity("Movie1: " + entity.getMovieId()
                + ", " + entity.getMovieName(), HttpStatus.OK);
    }

    public ResponseEntity<String> insert() {
        Movie1 movie= new Movie1(5,"abc" ,2016,106);
        springJdbcRepository.add(movie);
        return new ResponseEntity("Movie1 Add: " + movie.getMovieId()
                + ", " + movie.getMovieId()+","+movie.getYear()+","+movie.getRatings(), HttpStatus.OK);
    }

    public ResponseEntity<String> read() {
        Movie1 entity = springJdbcRepository.get(2);
        return new ResponseEntity("Movie1 Get: " + entity.getMovieId()
                + ", " + entity.getMovieName(), HttpStatus.OK);
    }

    public ResponseEntity<String> update() {
        Movie1 movie= new Movie1(4,"Xyz", 2016,4);
        springJdbcRepository.update(movie);
        return new ResponseEntity("Movie1 Update: " + movie.getMovieId()
                + ", " + movie.getMovieName()+","+movie.getYear()+","+movie.getRatings(), HttpStatus.OK);
    }

    public ResponseEntity<String> delete() {
        Movie1 entity = new Movie1(4);
        springJdbcRepository.delete(entity);
        return new ResponseEntity("Movie1 Delete: " + entity.getMovieId()
                + ", " + entity.getMovieName(), HttpStatus.OK);
    }
    public ResponseEntity<?> getAll() {
        List<Movie1> movie1List =springJdbcRepository.getAll();
        return new ResponseEntity<List<Movie1>>(movie1List,HttpStatus.OK);
    }
}
