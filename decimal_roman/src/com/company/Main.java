package com.company;

import java.util.Scanner;

public class Main {
       static Solution solution=new Solution();
    public static void main(String[] args) {
	    int n;
        System.out.println("enetr the number");
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        String p=solution.intToRoman(n);
        System.out.println(p);
    }
}
class Solution {
    public String intToRoman(int num) {
        String s="";
        int x=num;
        while(x>=1){
            if(x>1000){
                s+="M";
                x-=1000;

            }
            else if(x>=500&&x<900){
                s+="D";
                x-=500;
            }
            else if(x>=100&&x<400){
                s+='C';
                x-=100;
            }
            else if(x>=50&&x<90){
                s+='L';
                x-=50;
            }
            else if(x>=10&&x<40){
                s+='X';
                x-=10;
            }
            else if(x>=5&&x<9){
                s+='V';
                x-=5;
            }
            else if(x>=1&&x<4){
                s+='I';
                x-=1;
            }
            else if(x==4){
                s+="IV";
                x-=4;
            }
            else if(x==9){
                s+="IX";
                x-=9;
            }
            else if(x>=40&&x<50){
                s+="XL";
                x-=40;
            }
            else if(x>=90&&x<100){
                s+="XC";
                x-=90;
            }
            else if(x>=400&&x<500){
                s+="CD";
                x-=400;
            }
            else if(x>=900&&x<1000){
                s+="CM";
                x-=900;
            }





        }return s;



    }}


