package com.distilled.beer.repository;


import com.distilled.beer.entity.BeerEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface BeerRepository extends CrudRepository<BeerEntity, Long> {

    @Query(value = "SELECT * FROM beer ORDER BY RAND() LIMIT 1", nativeQuery = true)
    BeerEntity findRandom();

    BeerEntity findByBeerID(String bearID);
}
