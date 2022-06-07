package com.company.Mediator;

public interface ISupplyController {
    public void registerRetailer(Retailer retailer);
    public void registerSupplier(Supplier supplier);
    public void demandSetter(Boolean needed);
    public Boolean isNeeded();

}
