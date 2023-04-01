public class SumOfOdd {
    public static void main(String[] args) {
        int count=0;
        int sum=0;
        for (int i=10;i<=1000;i++){
            if (i%2!=0){
                System.out.println("The odd numbers are "+i);
                sum+=i;
                count++;
            }
            if (count==30){
                break;
            }
        }
        System.out.println("Sum of the odd number =" +sum);
    }
}
