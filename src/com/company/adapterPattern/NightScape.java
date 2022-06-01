package com.company.adapterPattern;

 class NightScape implements AdvancedCamera{

    @Override
    public void nightScape(String fileName) {
        System.out.println("Clicking in NightScape mode");
    }

    @Override
    public void portrait(String fileName) {

    }
}
