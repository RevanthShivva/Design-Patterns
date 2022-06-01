package com.company.FlyWeight;

public class SadFace implements Emojis{
    @Override
    public void create()   {
        System.out.println("Creating Sad face emoji");
    }

    @Override
    public void use() {
        System.out.println("Using Happy face emoji");
    }
}
