package Day_15;

public class MethodTest {

    public  void printArray(int [] arrayList){

        for (int i = 0 ; i < arrayList.length ; i++){
            System.out.println(arrayList[i]);
        }


    }
    public  void syaHello(String name){
        System.out.println("hello "+name+" welcome to my new class.");

    }


    public static void sum2Numbers(int num1 , int num2){
        int total = num1+num2;
        System.out.println("This is sum :"+total);

    }
}
