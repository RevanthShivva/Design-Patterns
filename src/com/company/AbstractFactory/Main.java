package com.company.AbstractFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        AbstractFactory abstractFactory = factory.getFactory(s);

        if(s.equalsIgnoreCase("mobile")){
            String brand = scanner.next();
            Mobiles mobiles = abstractFactory.getMobile(brand);
            mobiles.brandName();
        }else if(s.equalsIgnoreCase("watches")){
            String brand= scanner.next();
            SmartWatches smartWatches = abstractFactory.getWatches(brand);
            smartWatches.watchName();
        }

    }
}
