package Day_17;

public class Car {
    String brand ;
    String color;
    int year;
    int setNumber;
    int maxSpeed;



    Car(String b, String c, int y,int set,int max){
        this.brand = b;
        this.color= c;
        this.year= y;
        this.setNumber=set;
        this.maxSpeed=max;


    }

    Car(String br , String co){
        this.brand= br;
        this.color = co;
    }

    void start (){
        System.out.println("Car started");
    }

    void breack (){
        System.out.println("Car breacked");
    }

    void park (){
        System.out.println("Car is parked");
    }

    void printInfo(){
        System.out.println("Brand :"+brand);
        System.out.println("Car Color is :"+color);
        System.out.println("Max Speed is :"+maxSpeed);
        System.out.println("Number of Set :"+setNumber);
        System.out.println("Car Year is :"+year);
    }

}



