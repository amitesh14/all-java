package com.company;

public class Main {

    public static void main(String[] args) {
      int d=isPalindrome(1331);
      if(d==1)
        System.out.println( " is palindrome");
      else
          System.out.println(" is not a palindrome");

    }
    public static int isPalindrome(int n){

        int m=n;
        int q=n;
        int a=0,c=0,b=0,o=0,e=0;
        if (n > 10) {
            while(n>0)   {
                a=n%10;
                b=b*10+a;
                n/=10;

            }

            if(b==m) {
                return 1;
            }


        }
       return 2;
        }






    }

