package Day_30.Test;

public class Main {
    public static void main(String[] args) {


//    boolean ok = calculation(3.3,6.5);
//        System.out.println(ok);
//    }
//
//
//    public static boolean calculation(double num1  , double num2){
//        double total = num1+num2;
//        if (total<=50){
//            return true;
//        }
//        else {
//            return false;
//        }

//
//        int x = 0;
//
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                x++;
//            }
//        }
//
//        System.out.println(x);
//    }


        Movie movie1  = new Movie("Ma");
        Movie movie2  = new Movie("Ma");

        if (movie1==movie2){
            System.out.println("yes");
        }else {
            System.out.println("No");
        }

}


static class Movie {
    String name;

    public Movie(String name) {
        this.name = name;
    }
}
}