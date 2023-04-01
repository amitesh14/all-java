public class SpeedConvertorExercise {

    public static void main(String[] args) {

        toMilesPerHour(75.114);

    }

    public static void toMilesPerHour(double kilometersPerHour){

        double milesPerHour=(0.621371*kilometersPerHour);
           double x= (long)milesPerHour;
        if (milesPerHour>=0){
            if (milesPerHour >= x+0.5)
            System.out.println(kilometersPerHour + " km/h = " + (x+=1) + " mi/h");
            else{
                System.out.println(kilometersPerHour + " km/h = " + x +" mi/h");
            }
        }
        else {
            System.out.println(-1);
        }


    }
}
