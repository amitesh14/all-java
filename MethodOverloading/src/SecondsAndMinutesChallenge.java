public class SecondsAndMinutesChallenge {
    // Constants are the variable whose value when is fixed. we use below method to call a constant
    public static final String INVALID_value= "invalid value";

    public static void main(String[] args) {

        getDurationString(61,00);
        getDurationString(-10);

    }

    public static String getDurationString(int minutes, int seconds){
        int hour=minutes/60;
        int minute=minutes%60;
        if (minutes>=0 &&(seconds>=0 && seconds<=59)){
            System.out.println(minutes +" minutes "+seconds
                    +" seconds = "+ hour +" hours "
                    + minute + " minutes "+seconds+" seconds");
            return "hour";

        }
        else {
            System.out.println (INVALID_value);
            return "-1";

        }

    }
    public static String getDurationString( int seconds){
        int minute= seconds/60;
        int second=seconds%60;
        if (seconds>=0){
            System.out.println( seconds +" s = "+minute+"min, "+second+"seconds");
            getDurationString(minute,second);
            return "0";
        }
        else {
            System.out.println(INVALID_value);
            return "-1";
        }
    }


    }
