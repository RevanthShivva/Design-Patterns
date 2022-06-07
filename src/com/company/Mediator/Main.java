package com.company.Mediator;

public class Main {

  public static void main(String[] args) {
        ISupplyController supplyController = new SupplyController();
        Retailer retailer = new Retailer(supplyController);
        Supplier supplier = new Supplier(supplyController);
        supplier.sendGoods();
        System.out.println();
        retailer.needSupplies();
        supplier.readyToSend();
        supplier.sendGoods();
        supplier.finished();

    }
}