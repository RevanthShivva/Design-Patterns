package com.company.adapterPattern;
class Portrait implements AdvancedCamera {




    @Override
    public void capture(String fileName) {
        System.out.println("Clicking in Portrait mode");
    }
}
