package com.company;

public class Main {

    public static void main(String[] args) {
        int value=5;
          	if (value == 1){
                System.out.println("it was one");
            }
              else if( value==2){
                System.out.println("value was 2");
            }
              else{
                System.out.println("value was not 1 or 2");
              }
  //------------------------------------------------------------------------------------------------------------------
         //alternate method to do this is by using switch mwthod
        // In switch int,char ,string,short &byte
        switch (value){
            case 1: //here it check for value=1
                System.out.println("value was 1");
                break;// it is used to break the switch if any of the case is executed
            case 2:
                System.out.println("value was 2");
                break;
            case 3:case 4: case 5:
                System.out.println("value was "+ value);
                break;
            default:
                System.out.println("was not 1,2,3,4,or 5");
                break;
        }


    }
}
