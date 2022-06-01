package com.company.FlyWeight;

public class Hearts implements Emojis{
    @Override
    public void create() {
        System.out.println("Creating Heart emoji");
    }

    @Override
    public void use() {
        System.out.println("Using Heart face emoji");
    }
}
