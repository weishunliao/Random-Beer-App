package com.distilled.beer.repository;


import com.distilled.beer.entity.BeerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface BeerRepository extends CrudRepository<BeerEntity, Long> {

    BeerEntity findFirstByOrderByIdAsc();

    BeerEntity findFirstByOrderByIdDesc();

    BeerEntity findByBeerID(String bearID);
}
