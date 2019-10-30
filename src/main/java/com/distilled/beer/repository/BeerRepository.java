package com.distilled.beer.repository;


import com.distilled.beer.entity.BeerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BeerRepository extends CrudRepository<BeerEntity, Integer> {
    BeerEntity findById(int id);

    List<BeerEntity> findByBeers();


}
