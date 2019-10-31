package com.distilled.beer.service.impl;

import com.distilled.beer.entity.BeerEntity;
import com.distilled.beer.exception.BeerServiceException;
import com.distilled.beer.repository.BeerRepository;
import com.distilled.beer.shared.dto.BeerDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

public class BeerServiceTest {

    @InjectMocks
    BeerService beerService;

    @Mock
    BeerRepository beerRepository;

    private BeerEntity beerEntity1;
    private BeerEntity beerEntity2;
    private Optional<BeerEntity> optionalBeerEntity;

    private List<BeerEntity> beerEntities;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        beerEntity1 = new BeerEntity();
        beerEntity1.setBeerID("AL21MN");
        beerEntity1.setId(234);
        beerEntity1.setAbv(9.8);
        beerEntity1.setName("Cool beer1");
        beerEntity1.setBreweryLocation("Cork");
        beerEntity2 = new BeerEntity();
        beerEntity2.setBeerID("AL21MN");
        beerEntity2.setId(34);
        beerEntity2.setAbv(1.8);
        beerEntity2.setName("Cool beer2");
        beerEntity2.setBreweryLocation("Cork");
        beerEntities = new ArrayList<>();
        beerEntities.add(beerEntity1);
        beerEntities.add(beerEntity2);

        optionalBeerEntity = Optional.of(beerEntity2);

    }

    @Test
    void getBeerTest() {
        when(beerRepository.findByBeerID(anyString())).thenReturn(beerEntity1);
        BeerDto beerDto = beerService.getBeer("AL21MN");
        assertNotNull(beerDto);
        assertEquals(9.8,beerDto.getAbv());
    }

    @Test
    void getBeersTest() {
        when(beerRepository.findAll()).thenReturn(beerEntities);
        List<BeerDto> beers = beerService.getBeers();

        assertNotNull(beers);
        assertEquals(2,beers.size());
    }


    @Test
    void getRandomBeerTest() {
        when(beerRepository.findFirstByOrderByIdDesc()).thenReturn(beerEntity1);
        when(beerRepository.findFirstByOrderByIdAsc()).thenReturn(beerEntity2);
        when(beerRepository.count()).thenReturn(10L);
        when(beerRepository.findById(anyLong())).thenReturn(optionalBeerEntity);
        when(beerRepository.findByBeerID(anyString())).thenReturn(beerEntity2);
        BeerDto beerDto = beerService.getRandomBeer();
        assertNotNull(beerDto);
        assertEquals("Cool beer2", beerDto.getName());
    }

    @Test
    void errorHandlerTest() {
        when(beerRepository.findByBeerID(anyString())).thenReturn(null);
        assertThrows(BeerServiceException.class, () -> {
            beerService.getBeer("IFE89E");
        });
    }
}
