package com.company.Builder;

public class Main {
    public static void main(String[] args) {
        Laptop laptop ;
        laptop =
                new LaptopBuilder().setOperatingSystem("Windows").setRAM("8 GB").setGraphics("NVIDIA 4GB").build();
        System.out.println(laptop);
    }
}
