package com.company.statePattern;

public class Controller {
    Dispenser dispenser;
    public void assignState(String str){
        if(str.equals("cool")){
            dispenser = new CoolingState();
        }
        else{
            dispenser = new HeatingState();
        }
    }

    public void work(){
        dispenser.state();
    }
}
