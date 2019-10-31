package com.distilled.beer.controller;

import com.distilled.beer.service.impl.BeerService;
import com.distilled.beer.shared.dto.BeerDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

public class BeerControllerTest {

    @InjectMocks
    BeerController beerController;

    @Mock
    BeerService beerService;

    private BeerDto beerDto;
    private BeerDto beerDto2;
    private List<BeerDto> beerDtos;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        beerDto = new BeerDto();
        beerDto2 = new BeerDto();
        beerDto.setName("Best Beer");
        beerDto.setAbv(5.1);
        beerDto.setDescription("The best beer in Ireland, must try!");
        beerDto.setBreweryName("Murphy's house");
        beerDto.setBreweryLocation("Dublin");
        beerDtos = new ArrayList<>();
        beerDtos.add(beerDto);
        beerDtos.add(beerDto2);
    }

    @Test
    void getBeerTest() {
        when(beerService.getBeer(anyString())).thenReturn(beerDto);
        BeerDto beer = beerController.getBeer("LU72BA");
        assertNotNull(beer);
        assertEquals(5.1, beer.getAbv());
        assertEquals("Dublin", beer.getBreweryLocation());
    }

    @Test
    void getBeersTest() {
        when(beerService.getBeers()).thenReturn(beerDtos);
        List<BeerDto> allBeers = beerController.getAllBeers();
        assertNotNull(allBeers);
        assertEquals(2, allBeers.size());
    }
}
