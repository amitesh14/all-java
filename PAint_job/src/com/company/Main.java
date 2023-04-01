package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("press 1 if you know length width of wall and available bucket\npress 2 if you know length " +
                "width of wall \npress 3 if you know area  of wall ");


        int t=scan.nextInt();
        switch (t) {
            case 1:
            System.out.println("enter length");
            double length = scan.nextDouble();
            System.out.println("enter width");
            double width = scan.nextDouble();
            System.out.println("enter area per bucket");
            double areaPerBucket = scan.nextDouble();
            System.out.println("enter available bucket ");
            int availblebucket = scan.nextInt();
            int p = getBucketCount(length, width, areaPerBucket, availblebucket);
            System.out.println("the required bucket is" + p);
            break;
            case 2:
               System.out.println("enter length");
                length = scan.nextDouble();
                System.out.println("enter width");
                 width = scan.nextDouble();
                System.out.println("enter area per bucket");
                 areaPerBucket = scan.nextDouble();
            int q = getBucketCount(length, width, areaPerBucket);
            System.out.println("the required bucket is" + q);
            break;
            case 3:
                System.out.println("enter area per bucket");
                areaPerBucket = scan.nextDouble();
            double area = scan.nextDouble();
            System.out.println("the required bucket is " + getBucketCount(area, areaPerBucket));
        }


    }
    public static int getBucketCount(double length,double width,double areaPerBucket,int  availableBucket) {
        int totalBucket=0;
        int moreBucket = 0;
        if (length > 0 && width > 0 && areaPerBucket > 0 && availableBucket >= 0) {
            double area = length * width;
            int p = (int) area;
           if (area % areaPerBucket != 0.00) {
                if ((area - (double) p) >= 0) {
                    totalBucket = (int) (area / areaPerBucket) + 1;
                    moreBucket = totalBucket - availableBucket;

                }
                return moreBucket;
            }
            else {
                totalBucket=(int)(area/areaPerBucket);
                return totalBucket - availableBucket;
            }
        }
        else
            return -1;
    }
    public static int getBucketCount(double length,double width,double areaPerBucket) {
        int totalBucket=0;
      //  int moreBucket = 0;
        if (length > 0 && width > 0 && areaPerBucket > 0 ) {
            double area = length * width;
            int p = (int) area;
            if (area % areaPerBucket != 0) {
                if ((area - (double) p) >= 0) {
                    totalBucket = (int) (area / areaPerBucket) + 1;


                }
                return totalBucket;
            }
            else {
                totalBucket=(int)(area/areaPerBucket);
                return totalBucket;
            }
        }
        else
            return -1;
    }
    public static int getBucketCount(double area,double areaPerBucket) {
        int totalBucket=0;
        //  int moreBucket = 0;
        if (area>0 && areaPerBucket > 0 ) {

            int p = (int) area;
            if (area % areaPerBucket != 0) {
                if ((area - (double) p) >= 0) {
                    totalBucket = (int) (area / areaPerBucket) + 1;


                }
                return totalBucket;
            }
            else {
                totalBucket=(int)(area/areaPerBucket);
                return totalBucket;
            }
        }
        else
            return -1;
    }

}
