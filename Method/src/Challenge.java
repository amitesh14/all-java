public class Challenge {
    public static void main(String[]args){

        int highscore= calculateHighscoreposition(1500);
        displayHighscoreposition("Amitesh", highscore);

        highscore= calculateHighscoreposition(900);
        displayHighscoreposition("Kunal", highscore);

         highscore= calculateHighscoreposition(400);
        displayHighscoreposition("Mayank", highscore);

        highscore= calculateHighscoreposition(50);
        displayHighscoreposition("Utsav", highscore);




    }
    public static void displayHighscoreposition(String name, int highScorePosition){

        System.out.println(name +" managed to get position "+highScorePosition+
                " on high score table");



    }
    public static int calculateHighscoreposition(int score) {
       /* if (score >= 1000) {
            return 1;
        }
        else if (score >= 500 ) {
            return 2;
        } else if (score >= 100 ) {
            return 3;
        } else {
            return 4;
        }*/
        //We can do this in following ways
        int  value=4; //WE are assuming the value to be 4

        if (score>=1000){
            value=1;
        }
        else if (score>=500){
            value=2;
        }
        else if (score>=100){
            value=3;
        }
        return value;


    }

    }

