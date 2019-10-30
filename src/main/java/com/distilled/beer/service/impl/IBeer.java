package com.distilled.beer.service.impl;

import com.distilled.beer.shared.dto.BeerDto;

import java.util.List;

public interface IBeer {

    public BeerDto getBeer(String email);

    public List<BeerDto> getBeers();

    public BeerDto getRandomBeer();
}
