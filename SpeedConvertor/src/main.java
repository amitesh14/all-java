public class main {

    public static void main(String[] args) {

        SpeedConvertor.printConversion(10.5);
        //here we call the other public type by using the above command and then call the method using . method name

          // if we call the  .tomilesper hour we don't get anny result because there is no print command
           //to resolve this we specify another variable
          long miles=SpeedConvertor.toMilesPerHour(10.5);
        System.out.println("miles = "+ miles);

    }

}
