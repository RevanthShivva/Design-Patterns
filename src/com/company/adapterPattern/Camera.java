package com.company.adapterPattern;

class Camera implements NormalCamera {
   CameraAdapter cameraAdapter;

    @Override
    public void capture(String fileName) {


        if(fileName.equalsIgnoreCase("normal")){
            System.out.println("Clicking normal picture ");
        }


        else if(fileName.equalsIgnoreCase("night") || fileName.equalsIgnoreCase("portrait")){
           cameraAdapter = new CameraAdapter(fileName);
           cameraAdapter.capture(fileName);

        }
      else{

        }

    }

}