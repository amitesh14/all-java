package com.company;

public class Main {

    public static void main(String[] args) {
	   // Method overloding is a processs of having two or more method with same name,for this we just have to change the
        //input data type in each of them
        calculatescore("Amitesh aman",100);
        calculatescore(100);
        calculatescore();
    }
    public static int calculatescore(String playername, int score){
        System.out.println("Player "+ playername + " scored "+ score);
        return score;

    }
    public static int calculatescore(int score){
        System.out.println("unamed player scored "+score);
        return score;

    }
    public static int calculatescore(){
        System.out.println("no player score");
        return 0;
        // by only changing the return type we can specify two method eith same name


    }
    }
