package com.company;

public class Main {

    public static void main(String[] args) {
        //method is all the code inside public type. A new method should be put outside the another method
        int highscore= calculateScore(true,6000,5,100);
        System.out.println("Your final score was "+highscore);

      highscore=  calculateScore(true,10000,8,200);
        System.out.println("Your final score was "+highscore);

    }
//---------------------------------------------------------------------------------------------------------------------
    // the below code is run when we donot want to return any value back to the function called it
    /*public static void calculateScore(boolean GameOver, int score, int levelcomplete,int bonus){
        if(GameOver){
            int FinalScore= score+(levelcomplete*bonus);
            FinalScore+=1000;
            System.out.println("Your final score was "+FinalScore);
        }*/
        //Now if we change the value of Final score it changes for both
//----------------------------------------------------------------------------------------------------------------------

    // The below code is run when we want to return any value back to the function called it
    // to do this we replace VOID with the Data TYpe we want to send value
    // in this code we donot write the print statement in this method else the calculated data is sent to previous method
    public static int calculateScore(boolean GameOver, int score, int levelcomplete,int bonus){
        if(GameOver){
            int FinalScore= score+(levelcomplete*bonus);
            FinalScore+=1000;
            return FinalScore;
        }
        return -1; // -1 specifies that there is some error or not to return anything . WE can do this by using else statement



}
}
