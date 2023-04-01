package com.company;

class movie{
     private String name;
    public movie(String name) {
        this.name = name;
    }
    public String plot(){
         return "no plot";
     }
    public String getName() {
        return name;
    }

}
 class jaws extends movie{
     public jaws(){
         super("Jaws");
     }
     public String plot(){
         return "shark eat humans";
     }
 }
 class uri extends movie{
     public uri() {
         super("uri");
     }

     public String plot() {
         return "Surgical strike";
     }
 }
 class harryPOtter extends movie{
     public harryPOtter() {
         super("harry Potter");
     }

     @Override
     public String plot() {
         return "magical world";
     }
 }
 class nun extends movie{
     public nun( ) {
         super("nun");
     }
 }



public class Main {
    public static void main(String[] args) {
        for(int i=0; i<10 ; i++){
                movie Movie= randomMovie();
            System.out.println("movie " +i+
                             ": "+"name of movie = "+ Movie.getName()+"\n"+
                                "plot = "+ Movie.plot() +"\n");

    }


    }



    public static movie randomMovie() {
        int randomNumber=(int) (Math.random()*4)+1;
        System.out.println("the random number generated is "+ randomNumber);
        System.out.println("random number generated is "+ randomNumber);

        switch (randomNumber){
            case 1:
                return new jaws();
            case 2:
                return new uri();
            case 3:
                return new harryPOtter();
            case 4:
                return new nun();


        }
      return null;
    }
}
