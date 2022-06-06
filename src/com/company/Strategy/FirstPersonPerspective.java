package com.company.Strategy;

public class FirstPersonPerspective implements GameMode{
    @Override
    public void mode() {
        System.out.println("Playing in FPP mode");
    }
}
