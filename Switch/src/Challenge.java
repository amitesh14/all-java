public class Challenge {
    public static void main(String[] args) {
        char value= 'F';

        switch (value){
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("the character was " + value);
                 break;
            default:
                System.out.println("Not found");
                break;
        }
    }
}
