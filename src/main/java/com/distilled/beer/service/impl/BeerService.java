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
import java.util.Optional;
import java.util.Random;


@Service
public class BeerService implements IBeer {


    @Autowired
    private BeerRepository beerRepository;

    @Override
    public BeerDto getBeer(String bearId) {
        BeerEntity beerEntity = beerRepository.findByBeerID(bearId);
        BeerDto beerDto = new BeerDto();
        BeanUtils.copyProperties(beerEntity, beerDto);
        return beerDto;
    }

    @Override
    public List<BeerDto> getBeers() {
        Iterable<BeerEntity> beerEntities = beerRepository.findAll();
        List<BeerDto> beerDtoList = new ArrayList<>();
        for (BeerEntity beerEntity : beerEntities) {
            BeerDto beerDto = new BeerDto();
            BeanUtils.copyProperties(beerEntity, beerDto);
            beerDtoList.add(beerDto);
        }
        return beerDtoList;
    }

    @Override
    public BeerDto getRandomBeer() {
        int start = (int)beerRepository.findFirstByOrderByIdAsc().getId();
        int end = (int)beerRepository.findFirstByOrderByIdDesc().getId();
        Random random = new Random();
        int randomInt = random.nextInt(end - start + 1) + start;
        Optional<BeerEntity> beerEntity = beerRepository.findById((long) randomInt);
        while (!beerEntity.isPresent()) {
            randomInt = random.nextInt(end - start + 1) + start;
            beerEntity = beerRepository.findById((long) randomInt);
        }
        return getBeer(beerEntity.get().getBeerID());
    }
    
    
}
