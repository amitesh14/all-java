public class Challenge {
    public static void main(String[] args){
       int i=2;
       int n=32;
       int count=0;

        while(i<=n) {
            i++;
            if (!isEvennumber(i)) {
                continue; //it is different from break statement as it does not break the statement it will go to the begning
            }             //to execute the code for next number
            System.out.println("Even number" + i);
            count++;

            if (count == 5) {
                System.out.println("These are five even number");
                break;
            }

        }


    }


    public static boolean isEvennumber(int i){
        if(i%2==0){
            return true;
        }

        return false;


    }
}
