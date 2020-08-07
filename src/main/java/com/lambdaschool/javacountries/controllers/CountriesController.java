package com.lambdaschool.javacountries.controllers;

import com.lambdaschool.javacountries.models.WorldCountries;
import com.lambdaschool.javacountries.repositories.CountriesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CountriesController {
    @Autowired
    CountriesRepo emprepos;

    @GetMapping(value = "/name/all", produces = {"application/json"})
    public ResponseEntity<?>listAllCountries(){
        List<WorldCountries> myList = new ArrayList<>();
        emprepos.findAll().iterator().forEachRemaining(myList::add);
        return new ResponseEntity<>(myList, HttpStatus.OK);
    }
}
