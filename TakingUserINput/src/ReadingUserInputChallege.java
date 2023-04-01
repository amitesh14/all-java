import java.util.Scanner;

public class ReadingUserInputChallege {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        int count = 1;
        int newNumber = 0;

        while (count >= 0) {
            System.out.println("Enter your # " + count + " number  ");

            boolean hasNextInt = newScanner.hasNextInt();
            if (hasNextInt) {
                int number = newScanner.nextInt();

                count++;

                newNumber += number;


                if (count <= 10) {


                } else {
                    System.out.println("total sum = " + newNumber);
                    break;
                }
            } else {
                System.out.println("Invalid Value");
                break;
            }
        }


        newScanner.close();


    }
}
