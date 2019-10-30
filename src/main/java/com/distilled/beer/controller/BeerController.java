package com.distilled.beer.controller;


import com.distilled.beer.service.impl.BeerService;
import com.distilled.beer.shared.dto.BeerDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class BeerController {

    @Autowired
    BeerService beerService;

    @GetMapping(path = "/beers",
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<BeerDto> getAllBeers() {
        return beerService.getBeers();
    }
}
