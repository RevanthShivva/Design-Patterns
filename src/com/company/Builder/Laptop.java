package com.company.Builder;

public class Laptop {
    private String processor;
    private String RAM;
    private String OperatingSystem;
    private String graphics;

    public Laptop(String processor, String RAM, String operatingSystem, String graphics) {
        this.processor = processor;
        this.RAM = RAM;
        OperatingSystem = operatingSystem;
        this.graphics = graphics;
    }
  public Laptop(){};

    @Override
    public String toString() {
        return "Laptop{" +
                "processor='" + processor + '\'' +
                ", RAM='" + RAM + '\'' +
                ", OperatingSystem='" + OperatingSystem + '\'' +
                ", graphics='" + graphics + '\'' +
                '}';
    }
}
