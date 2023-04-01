package com.company;

public class Main {

    public static void main(String[] args){
       /*f (score<5000 && score>1000){
            System.out.println("Your score is less than 5000 but greater than 1000");
        }
        else if(score<1000){
            System.out.println("Your score is less than 1000");
        }
        else {
            System.out.println("yotur score is greater than 5000");
        }*/
        boolean GameOver= true;
        int score=6000;
        int levelcomplete= 5;
        int bonus= 100;

        if(GameOver){
            int FinalScore= score+(levelcomplete*bonus);
            FinalScore+= 1000;
            System.out.println("Your final score was "+FinalScore);
        }
        //here the new variable formed inside code block can not be used outside code block  so "FinalScore is invalid outside
        score=10000;
        levelcomplete=8;
        bonus=200;
        if(GameOver){
            int FinalScore= score+(levelcomplete*bonus);
            System.out.println("Your final score was "+FinalScore);
        }
    // This is disadvantage of duplicating as changing the value of "FinalScore"  as changing its value does not change
    //the next terms.



    }

}