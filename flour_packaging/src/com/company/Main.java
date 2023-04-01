/*Write a method named canPack with three parameters of type int named bigCount, smallCount and goal.
The parameter bigCount represents the count of big flour bags (5 kilo each).
The parameter smallCount represents the count of small flour bags (1 kilo each).
The parameter goal represents the goal amount of kilos of flour needed to assemble a package.
Therefore, the sum of the kilos of bigCount and smallCount must be at least equal to the value of goal.
 The method should return true if it is possible to make a package with goal kilos of flour.
If the sum is greater than goal, ensure that only full bags are used towards the goal amount.
For example, if goal = 9, bigCount = 2, and smallCount = 0,
the method should return false because each bigCountbag is 5 kilos and cannot be divided.
However, if goal = 9, bigCount = 1, and smallCount = 5, the method should return true because 1 full bigCount bag
and 4 full smallCount bags equal goal, and it's okay if there are additional bags left over.
If any of the parameters are negative, return false.*/
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i,count=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number of big package");
        int big=scan.nextInt();
        System.out.println("enter number of small package");
        int small=scan.nextInt();
        System.out.println("enter goal weight of package");
        int goal=scan.nextInt();
        for ( i = 0; i <= big; i++) {

            if (canPack(i, small, goal) == true)
                //System.out.println("can be packed");
                 count++;
        }
        System.out.println("total no. of ways is "+count);
        if(i==big)
            System.out.println("can not be packed");

    }
    public static boolean canPack(int big,int small,int goal) {
     if (big >= 0 && small >= 0 && goal >= 0) {

                if ((5 * big) <= goal) {
                    for (int j = 0; j <= small; j++) {
                        if (((5 * big) + j) == goal) {
                            System.out.println("number of big packet is "+big+"number of small packet is "+j);

                            return true;
                        }
                    }
                }


            return false;
        } else {
            return false;
        }


        /*if(goal/5>0){
            int r=goal/5;
            int s=goal%5;
            if(big>=r){
                if(small>=s)
                    return true;
            }
            else if(big<r){
                if(small>=(5*(r-big))+s)
                    return true;
            }
        }

            return false;
    }*/
    }

}
