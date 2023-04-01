
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for(int j=0;j<n;j++){
                int so=a+b;
                int f=1;
                for(int p=1;p<=j;p++){

                    f=f*2;

                    so =so +(f*b);
                }

                System.out.print(so+" ");
            }
            System.out.println("");
        }
        in.close();
    }

}
