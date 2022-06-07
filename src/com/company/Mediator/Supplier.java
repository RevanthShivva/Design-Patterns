package com.company.Mediator;

public class Supplier {
    private ISupplyController supplyMediator;

    public Supplier(ISupplyController mediator){
        supplyMediator = mediator;
    }


    public void sendGoods(){
        if(supplyMediator.isNeeded()){
            System.out.println("We are sending your ordered goods.");
            supplyMediator.demandSetter(false);
        }else{
            System.out.println("Send us a mail when you want goods");
        }
    }

    public void readyToSend(){
        System.out.println("Starting exporting goods");
    }

    public void finished(){
        System.out.println("Finished sending goods");

    }
}
