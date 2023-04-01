package com.company;



public class SumCalculator {
    private double firstNumber;
    private double secondNumber;
   public double getFirstNumber(){
       return this.firstNumber;
   }
    public double getSecondNumber(){
        return this.secondNumber;
    }
    public void setFirstNumber(double firstNumber){
       this.firstNumber=firstNumber;
    }
    public void setSecondNumber(double secondNumber){
       this.secondNumber=secondNumber;

    }
    public double getAddition(){
       return (firstNumber+secondNumber);
    }
    public double getSubstration(){
        return firstNumber-secondNumber;
    }
    public double getMultiplication(){
        return firstNumber*secondNumber;
    }
    public double getDivision(){
        return firstNumber/secondNumber;
    }


}
