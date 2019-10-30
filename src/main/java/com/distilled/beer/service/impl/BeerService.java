package com.distilled.beer.service.impl;

import com.distilled.beer.entity.BeerEntity;
import com.distilled.beer.repository.BeerRepository;
import com.distilled.beer.service.IBeer;
import com.distilled.beer.shared.dto.BeerDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class BeerService implements IBeer {


    @Autowired
    private BeerRepository beerRepository;

    @Override
    public BeerDto getBeer(String email) {
        return null;
    }

    @Override
    public List<BeerDto> getBeers() {
        List<BeerEntity> beers = beerRepository.findByBeers();

        List<BeerDto> beerDtoList = new ArrayList<>();

        for (BeerEntity beerEntity : beers) {
            BeerDto beerDto = new BeerDto();
            BeanUtils.copyProperties(beerEntity, beerDto);
            beerDtoList.add(beerDto);
        }
        return beerDtoList;
    }

    @Override
    public BeerDto getRandomBeer() {
        return null;
    }
}
