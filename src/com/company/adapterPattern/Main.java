package com.company.adapterPattern;

public class Main {
    public static void main(String[] args) {
        CameraApplication cameraApplication = new CameraApplication();

        cameraApplication.capture("normal");
        cameraApplication.capture( "night");
        cameraApplication.capture( "portrait");

    }
}