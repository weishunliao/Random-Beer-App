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


    private BeerService beerService;

    @Autowired
    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }


    @GetMapping(path = "/beers",
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<BeerDto> getAllBeers() {
        return beerService.getBeers();
    }


    @GetMapping(path = "/beer/{beerId}")
    public BeerDto getBeer(@PathVariable String beerId) {
        return beerService.getBeer(beerId);
    }

    @GetMapping(path = "/beer/random")
    public BeerDto getBeer() {
        return beerService.getRandomBeer();
    }


}
