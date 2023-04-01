import javax.swing.*;

public class primeNumberChallenge {
    public static void main(String[] args) {

        int count=0;
        for (int i=1;i<=50;i++ ){
            if (isPrime(i)){
                count++;
                System.out.println("the number "+i+" is a primenumber");
            }
            if(count==40 ){
                System.out.println("Exiting the loop");
                break;
            }


        }


    }
    public static boolean isPrime(int n){


            if (n == 1) {
                return false;
            }
            else if (n == 2) {
                return true;
            }
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }



        return true;

    }


}




