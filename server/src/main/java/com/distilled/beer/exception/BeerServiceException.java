package com.distilled.beer.exception;

public class BeerServiceException extends RuntimeException{
    public BeerServiceException(String message) {
        super(message);
    }
}

