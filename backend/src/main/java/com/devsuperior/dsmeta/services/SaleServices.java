package com.devsuperior.dsmeta.services;

@Service
public class SaleServices {
    @AutoWired
    private SaleRepository repository;

    public List<sale>findSales(){
        return repository.findAll();


    }
}