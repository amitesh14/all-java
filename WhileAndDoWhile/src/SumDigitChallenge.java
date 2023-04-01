public class SumDigitChallenge {
   /* public static void main(String[] args) {

        int p = sumDigit(7387445);
        System.out.println("The sum of digits  =" + p);
    }






        /* public static int sumDigit(int number){
          int hundredDigit = number/100;
          int tensDigit= number/10-(hundredDigit*10);
          int onesDigit= number-((hundredDigit*100)+(tensDigit*10));

          if( number>=0){
              return(hundredDigit+tensDigit+onesDigit);


        }
        return -1;
    }

    public static int sumDigit(int number) {
        if (number >= 10) {
            int c = 0;
            int p = 0;
            while (number > 0) {
                p = number % 10;
                number = number / 10;
                c = c + p;


            }


            return c;

        }

        return -1;
    }*/


    public static int main(int c) {
            if (c>=99){
                System.out.println("you have been fooled");
            }
            return 1;

    }
}
