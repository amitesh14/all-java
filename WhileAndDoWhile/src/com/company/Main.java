package com.company;

public class Main {

    public static void main(String[] args) {
        //While statement is like for statement but unlike for we have to specify the variable before using while also we
        //have to write a statement to increase its value
        int count=1;
        while(count!=5){
            System.out.println("count value is "+ count);
            count++;
        }
      //  for (count=1;count!=5;count++){
      //      System.out.println("count value is "+count);
        // }

        // We can write the above equation as follows
        System.out.println("--------------------------------------------------------------------------------------------");
        count=1;
        while ((true)){
            if (count == 5){
                break;
            }
            System.out.println("count value is "+ count);
            count++;

        }

        //Do while statement is to be executed atleast once else we get very rando m error
        System.out.println("--------------------------------------------------------------------------------------------");
        count=1;
        do {
            System.out.println("the count value is "+ count);
            count++;
        }
        while (count!=6);



    }
}
