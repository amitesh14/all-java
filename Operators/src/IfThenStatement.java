public class IfThenStatement {

    public static void main(String[] args) {

        boolean helloWOrld = true;
        if (helloWOrld == true) {
            System.out.println("HELLO ASHISH");}
            helloWOrld= true;
            if (helloWOrld== true){
                System.out.println("HELLO ASHISH");
            }

            int p=88;
            if(p>100 || p ==88){
                System.out.println("Your score is greater than 100 or equal to 88");
            }
        if(p>100 && p ==88){
            System.out.println("Your score is than than 100 and equal to 88");
        }
        boolean iscar =true;
        if(iscar== false){ // on place of(iscar==false) we can use (!is car) or (iscar!=true) same goes with (iscar==true)
            System.out.println("this is a car");
        }

//-------------------------------------------------------------------------------------------------------------------------
        //TERNARY OPERATOR
        boolean wascar= iscar ? true:false;
        if (wascar){
            System.out.println("this was car  ");
        }



    }
}