package com.company.AbstractFactory;

class MobileFactory implements AbstractFactory {
    @Override
    public Mobiles getMobile(String brand) {
        if(brand.equalsIgnoreCase("apple")){
            return new Apple();
        } else if (brand.equalsIgnoreCase("samsung")) {
           return  new Samsung();
        }
        else {
            return null;
        }
    }

    @Override
    public SmartWatches getWatches(String brand) {
        return null;
    }
}
