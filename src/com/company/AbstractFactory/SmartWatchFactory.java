package com.company.AbstractFactory;

class SmartWatchFactory implements AbstractFactory {


    @Override
    public SmartWatches getWatches(String brand) {
        if(brand.equalsIgnoreCase("noise")){
            return new Noise();
        }
        else if(brand.equalsIgnoreCase("firebolt")){
            return new FireBolt();
        }
        else{
            return null;
        }

    }
    @Override
    public Mobiles getMobile(String brand) {
        return null;
    }
}
