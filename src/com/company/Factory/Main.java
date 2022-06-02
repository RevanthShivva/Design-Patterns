package com.company.Factory;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        LaptopFactory laptopFactory = new LaptopFactory();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        Laptop laptop = laptopFactory.createLaptop(str);
        laptop.osType();

    }
}
