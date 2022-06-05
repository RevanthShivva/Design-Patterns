package com.company.AbstractFactory;

 class Noise implements SmartWatches{
    @Override
    public void watchName() {
        System.out.println("This is a Noise smart watch");
    }
}
