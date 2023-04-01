package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the size of array");
        int n= scan.nextInt();
        int[] nums=new int[n];
        for(int i=0;i< nums.length;i++){
            nums[i]= scan.nextInt();
        }
        int p=findNumbers(nums);
        System.out.println(p);


    }

        public static int findNumbers(int[] nums) {
            int p=0;
            for(int i=0;i<nums.length;i++){
                int count=0;
                while(nums[i]!=0){
                    nums[i]/=10;
                    count++;

                }
                if(count%2==0){
                    p++;
                }

            }

            return p;

        }

}
