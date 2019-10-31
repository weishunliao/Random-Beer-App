package com.distilled.beer.controller;


import com.distilled.beer.service.impl.BeerService;
import com.distilled.beer.shared.dto.BeerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class BeerController {

    @Autowired
    BeerService beerService;


    @GetMapping(path = "/beers",
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<BeerDto> getAllBeers() {
        return beerService.getBeers();
    }


    @GetMapping(path = "/beer/{beerId}",
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public BeerDto getBeer(@PathVariable String beerId) {
        return beerService.getBeer(beerId);
    }

    @GetMapping(path = "/beer/random",
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public BeerDto getBeer() {
        return beerService.getRandomBeer();
    }


}
