package com.company.adapterPattern;



class CameraAdapter implements Camera {

    AdvancedCamera advancedCamera;

    public CameraAdapter(String type){

        if(type.equalsIgnoreCase("night") ){
            advancedCamera = new NightScape();

        }else if (type.equalsIgnoreCase("portrait")){
           advancedCamera = new Portrait();
        }
    }

    @Override
    public void capture( String fileName) {

        if(fileName.equalsIgnoreCase("night")){
            advancedCamera.capture(fileName);
        }
        else if(fileName.equalsIgnoreCase("portrait")){
            advancedCamera.capture(fileName);
        }
    }
}
