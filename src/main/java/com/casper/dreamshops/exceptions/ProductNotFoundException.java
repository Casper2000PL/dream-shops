package com.casper.dreamshops.exceptions;

public class ProductNotFoundException extends  RuntimeException {
    public ProductNotFoundException(String message) {
        super(message);
    }
}
