package com.company.FlyWeight;

public class HappyFace implements Emojis{
    @Override
    public void create() {
        System.out.println("Creating Happy face emoji");
    }

    @Override
    public void use() {
        System.out.println("Using Happy face emoji");
    }
}
