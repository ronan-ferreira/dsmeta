package com.devsuperior.dsmeta.controllers;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @AutoWired
    private SaleService service;
    @GepMapping
    public List<Sale> findSale(){
            return service.finfSales();

        }

}