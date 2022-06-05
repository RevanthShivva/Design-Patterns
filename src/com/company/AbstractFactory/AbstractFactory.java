package com.company.AbstractFactory;

 interface AbstractFactory {
    public Mobiles getMobile(String brand);
    public SmartWatches getWatches(String brand);
}
