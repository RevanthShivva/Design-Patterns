package com.company.AbstractFactory;

 class Factory {
    public AbstractFactory getFactory(String string){
        if(string.equalsIgnoreCase("Mobile")){
            return new MobileFactory();
        } else if (string.equalsIgnoreCase("Smartwatches")) {
            return new SmartWatchFactory();

        }
        else{
            return null;
        }
    }
}
