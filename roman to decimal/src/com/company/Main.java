package com.company;

import java.util.Scanner;

public class Main {
     static Solution sol=new Solution();
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String p=scanner.nextLine();
       int m= sol.romanToInt(p);
        System.out.println(m);
    }
}
class Solution {
    public int romanToInt(String s) {
        char[] p= s.toCharArray();
        int sum=0;
        for(int i=0;i<p.length;i++){
            if((i+1)<(p.length)){
                if(p[i]=='I'&&(p[i+1]=='V'||p[i+1]=='X'||p[i+1]=='L'||p[i+1]=='C'||p[i+1]=='D'||p[i+1]=='M')){
                    sum-=1;
                }
                else if(p[i]=='I'){

                    sum+=1;
                }
                if(p[i]=='X'&&(p[i+1]=='L'||p[i+1]=='C'||p[i+1]=='D'||p[i+1]=='M')){
                    sum-=10;
                }
                else  if(p[i]=='X'){
                    sum+=10;}
                if(p[i]=='C'&&(p[i+1]=='D'||p[i+1]=='M')){
                    sum-=100;
                }
                else if(p[i]=='C')
                    sum+=100;
                if(p[i]=='V')
                    sum+=5;

                if(p[i]=='L')
                    sum+=50;

                if(p[i]=='D')
                    sum+=500;
                if(p[i]=='M')
                    sum+=1000;

            }else{

                if(p[i]=='I')
                {
                    sum+=1;
                }
                if(p[i]=='X')
                {
                    sum+=10;
                }
                if(p[i]=='C')
                {
                    sum+=100;
                }
                if(p[i]=='V')
                    sum+=5;

                if(p[i]=='L')
                    sum+=50;

                if(p[i]=='D')
                    sum+=500;
                if(p[i]=='M')
                    sum+=1000;

            }}
        return sum;

    }
}
