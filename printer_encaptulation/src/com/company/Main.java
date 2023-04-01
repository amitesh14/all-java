package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter toner level");
        double tone=scan.nextDouble();
        System.out.println("enter page to be printed");
        double print=scan.nextDouble();

        System.out.println("enter is it a duplex printer");
        boolean duplex=scan.nextBoolean();
	Printer printer=new Printer(tone,print,duplex);
        int p=1;
       double pt= printer.printed_page();
        double count=pt;



        while(p==1){
            if(printer.getToner_level()<0.02&&duplex==true){
                break;}
            else  if(printer.getToner_level()<0.01&&duplex==false){
                break;}
        System.out.println("to print more pages enter 1 else 0");
         p= scan.nextInt();


             System.out.println("enter more pages to be printed");
             int s = scan.nextInt();
             printer.getPrint_pages(s);
            double st= printer.printed_page();
             count +=st ;



    }

        System.out.println("total pages  printed = "+count+" remaining toner level "+printer.getToner_level());


    }
}
class Printer{
    private  double toner_level=100;
    private  double print_pages=0;
    private boolean duplex;

    public Printer(double toner_level, double printed_pages, boolean duplex) {
        if(toner_level>0&&toner_level<=100){
        this.toner_level = toner_level;}
        this.print_pages = printed_pages;
        this.duplex = duplex;
    }

    public double getPrint_pages(int pages) {
        print_pages=pages;

        return print_pages;
    }

    public double getToner_level() {
        return toner_level;
    }

    public double printed_page(){
        if(duplex){
            if(print_pages<=toner_level*50) {
                print_pages =print_pages ;
                toner_level-= print_pages/50;
                System.out.println("pages printed is "+print_pages+" toner level remaining is "+toner_level);
                return print_pages;
            }
            else{
                print_pages=toner_level*50;
                toner_level-=(double) print_pages/50;
                System.out.println("all pages cannot be printed.pages printed is "+print_pages+" toner level remaining is "+toner_level);
                return print_pages;
            }
        }
        else
        {

                if(print_pages<=toner_level*100) {
                    print_pages = print_pages;
                    toner_level-= print_pages/100;
                    System.out.println("pages printed is "+print_pages+" toner level remaining is "+toner_level);
                    return print_pages;
                }
                else{
                    print_pages=toner_level*100;
                    toner_level-= print_pages/100;
                    System.out.println("all pages cannot be printed.pages printed is "+print_pages+" toner level remaining is "+toner_level);
                    return print_pages;
                }


        }



}
}
