public class DayOfTheWeek {
    public static void main(String[] args) {

        printDayOfTheWeek(4);

    }

    public static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("The day is Sunday");
                break;
            case 1:
                System.out.println("The day is Monday");
                break;
            case 2 :
                System.out.println("The day is Tuesday");
                break;
            case 3:
                System.out.println("The day is Wednesday");
                break;
            case 4:
                System.out.println("The day is Thursday");
                break;
            case 5:
                System.out.println("The day is Friday");
                break;
            case 6:
                System.out.println("The day is Saturday");
                break;
            default:
                System.out.println("Invalid Day");
        }
//---------------------------------------------------------------------------------------------------------------------------------------
       //USING if statement

       if(day==0){
           System.out.println("It is Sunday");
       }
       else if(day==1){
           System.out.println("It is Monday");
       }
       else if(day==2){
           System.out.println("It is Tuesday");
       }
       else if(day==3){
           System.out.println("It is Wednesday");
       }
       else if(day==4){
           System.out.println("It is Thursday");
       }
       else if(day==5){
           System.out.println("It is Friday");
       }
       else if(day==6){
           System.out.println("It is Saturday");
       }
       else{
           System.out.println("Invalid Day");
       }





    }
}
