package com.company.adapterPattern;

 class NightScape implements AdvancedCamera{

    @Override
    public void capture(String fileName) {
        System.out.println("Clicking in NightScape mode");
    }


}
