
public class dogBark {

    public static boolean bark(boolean barking, int hourOfDay ){
        if((hourOfDay>= 0 && hourOfDay<=8 || hourOfDay>=22 &&hourOfDay<=23) && barking )
            return true;
        else{
            return false;
        }



    }
}
