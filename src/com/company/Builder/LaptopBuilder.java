package com.company.Builder;

public class LaptopBuilder {
    private String processor;
    private String RAM;
    private String OperatingSystem;
    private String graphics;

    public LaptopBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public LaptopBuilder setRAM(String RAM) {
        this.RAM = RAM;
        return this;
    }

    public LaptopBuilder setOperatingSystem(String operatingSystem) {
        OperatingSystem = operatingSystem;
        return this;
    }

    public LaptopBuilder setGraphics(String graphics) {
        this.graphics = graphics;
        return this;
    }
    public Laptop build(){
        return new Laptop(processor,RAM,OperatingSystem,graphics);

    }
}
