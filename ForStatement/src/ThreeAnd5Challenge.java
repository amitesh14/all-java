public class ThreeAnd5Challenge {
    public static void main(String[] args) {
        int count=0;
        int sum=0;
        for (int i=1; i<=1000;i++){

            if (i%3==0 && i%5==0){
                System.out.println("the number divisible by 3 and 5= "+i);
                sum+=i;
                count++;


            }
            if (count==5){
                break;
            }

        }
        System.out.println("sum = "+ sum);
    }

}