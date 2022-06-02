package com.company.Singleton;
//Lazy instatiation
public class College {
    private static College college;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int count;
    private College(){
        count++;
        System.out.println("Instantiated College " + count + " time" );
    }
    public static College createCollege(){
        if(college == null){
            return new College();
        }
        return college;
    }


}
