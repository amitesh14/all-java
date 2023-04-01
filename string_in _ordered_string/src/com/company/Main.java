package com.company;

import java.util.Scanner;

public class Main {
     static Solution solution=new Solution();
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
        for (int i =0;magazine.length()>=(i+ransomNote.length());i++){
            //System.out.println(magazine.substring(i,(i+ransomNote.length())));
            if(ransomNote.equals(magazine.substring(i,(i+ransomNote.length())))){
                return true;
            }

        }
        return false;

    }
}
