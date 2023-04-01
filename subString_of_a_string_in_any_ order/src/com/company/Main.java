package com.company;

import java.util.Scanner;

public class Main {
    static Solution solution = new Solution();

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String p;
        String q;
        System.out.println("enter first string");
        p=scanner.nextLine();
        System.out.println("enter second string");
        q=scanner.nextLine();
        boolean x=solution.canConstruct(p,q);
        System.out.println(x);

    }
}
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] p=ransomNote.toCharArray();
        int[] q= new int[p.length];
        char[] p1=magazine.toCharArray();
        int[] q1=new int[p1.length];
        char[] k=new char[p.length];
        char[] t=new char[p1.length];
        int x,l,flag=0;
        for(int i=0;i<ransomNote.length();i++){
            x=0;
            k[i]=p[i];
            for(int j=0;j<ransomNote.length();j++){
                if(k[i]==p[j]){
                    p[j]='0';
                    x++;
                }
                q[i]=x;



            }
        }
        for(int i=0;i<magazine.length();i++){
            x=0;
            t[i]=p1[i];
            for(int j=0;j<magazine.length();j++){
                if(t[i]==p1[j]){
                    p1[j]='0';
                    x++;
                }
                q1[i]=x;



            }
        }
        if(p1.length>=p.length){
            for(l=0;l<k.length;l++){
                char e=k[l];
                if(e!='0'){
                    for(int j=0;j<t.length;j++){
                        if(e==t[j]){
                            if(q[l]<=q1[j]){

                                break;

                            }

                            else{flag=1;

                                break;
                            }


                        }
                        else if(j==t.length-1&&e!=t[j]){

                            flag=1;

                            break;
                        }

                    }}
                if(flag==1){
                    break;
                }
            }}
        else{
            return false;
        }



        if(l==(k.length)&&flag==0)
            return true;
        else
            return false;
    }

}