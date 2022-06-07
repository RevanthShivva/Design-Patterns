package com.company.Mediator;

public class Retailer {
    private ISupplyController supplyMediator;
    public Retailer(ISupplyController mediator){
        supplyMediator = mediator;
    }

    public void needSupplies(){
        System.out.println("We are in demand for the goods");
        supplyMediator.demandSetter(true);
    }

}
