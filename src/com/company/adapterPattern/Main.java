package com.company.adapterPattern;

public class Main {
    public static void main(String[] args) {
        Camera camera = new Camera();

        camera.capture("normal");
        camera.capture( "night");
        camera.capture( "portrait");

    }
}