package com.company.adapterPattern;
class Portrait implements AdvancedCamera {

    @Override
    public void nightScape(String fileName) {

    }

    @Override
    public void portrait(String fileName) {
        System.out.println("Clicking in Portrait mode");
    }
}
