package com.company;

import java.util.Locale;

public class Car   {
    private int doors;
    private int wheels;// we can acess the model type outside by making it public but its not a good way
    private String model;
    private String  engine;

    //Another way is by using a method to update the model and other variable
    //This is setter-- it is used to set the value of variable
    public void model(String model){
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera")||validModel.equals("commodore")){  //HERE VALIDMODEL.EQUALS IS USED TO COMPARE TWO OBJECTS

        this.model=model;}//this is used to specify the field model equal to parameter variable
        else{
            this.model="Unknown";
        }
    }
    //This is getter -- It is used to get the value returned
    public String getModel(){
        return this.model;
    }
}
