public class Challenge {
    public static void main(String[] args) {
       calFeetAndInchesToCentimeter(22,10);
       calFeetAndInchesToCentimeter(83);
    }

    public static double calFeetAndInchesToCentimeter(int feet, int inches){
        if(feet>=0 && (inches>=0 && inches<=12)){
            System.out.println(feet +" feet "+inches +" inches = "+ ((12*2.54*feet)+(2.54*inches) )+ " cm") ;
            return feet;
        }
        else {
            return -1;
        }
    }

    public static double calFeetAndInchesToCentimeter( int inches){
        int feet= inches/12;
        int inch=inches%12;
        if (inches>=0){
            System.out.println(inches +" inches = "+ (inches/12) + " feet and "+ (inches%12)+ " inches");
            calFeetAndInchesToCentimeter(inches/12,inches%12);
            return 100;
        }
        else {
            return -1;
        }



    }

}
