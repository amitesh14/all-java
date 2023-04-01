package com.company;

public class Printer {
    private boolean isDuplexPrinter;
    private double tonerLevel=100;
    private int numberOfPageToPrint;

    public Printer(boolean isDuplexPrinter, double tonerLevel, int numberOfPageToPrint) {
        this.isDuplexPrinter = isDuplexPrinter;
        if(tonerLevel<= 100 && tonerLevel>=0){
        this.tonerLevel = tonerLevel;}
        this.numberOfPageToPrint = numberOfPageToPrint;
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }



    public void printpages() {
      if(isDuplexPrinter) {
          if (tonerLevel > 0 && tonerLevel >= numberOfPageToPrint) {
              tonerLevel-=numberOfPageToPrint;
              System.out.println("number of pages to print = "+ numberOfPageToPrint+ " remaining toner level = "+ tonerLevel);
          }
      }



      else if(!isDuplexPrinter) {
          if( tonerLevel > 0 && tonerLevel>=(numberOfPageToPrint)) {
              tonerLevel-= (0.5*numberOfPageToPrint);
              System.out.println("number of pages to print = "  +numberOfPageToPrint + " remaining tonerlevel = " + tonerLevel);

          }
      }
    }
    public double addToner(double addToner){
        tonerLevel+= addToner;
        System.out.println(tonerLevel);

        return tonerLevel;
    }
}
