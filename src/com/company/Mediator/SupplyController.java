package com.company.Mediator;

public class SupplyController implements ISupplyController{
    private Retailer retailer; //runway
    private Supplier supplier;
    public Boolean needed = false;

    @Override
    public void registerRetailer(Retailer retailer) {
     this.retailer= retailer;
    }

    @Override
    public void registerSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    @Override
    public void demandSetter(Boolean needed) {
       this.needed = needed;
    }

    @Override
    public Boolean isNeeded() {
        return needed;
    }
}
