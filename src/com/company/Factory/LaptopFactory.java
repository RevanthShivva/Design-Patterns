package com.company.Factory;

public class LaptopFactory {
    Laptop laptop;
    public Laptop createLaptop(String string){
        if(string.equalsIgnoreCase("Linux")){
            laptop = new Linux();
            return laptop;
        }else if(string.equalsIgnoreCase("Windows")){
            laptop = new Windows();
            return laptop;
        }else{
            laptop= new Mac();
            return laptop;
        }
    }
}
