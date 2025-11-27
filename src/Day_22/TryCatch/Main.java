package Day_22.TryCatch;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
//        String name;
//        System.out.println("Plz enter your name: ");
//        try {
//            name = scan.nextLine();
//        }catch (Exception e){
//            System.out.println("Invalid input please enter char");
//        }
//
//        int birthday;
//        System.out.println("Plz enter your birthday: ");
//        try {
//            birthday=scan.nextInt();
//        }catch (Exception e){
//            System.out.println("Plz enter just number: ");
//        }







//try{
//    int a = 10;
//    int b  = 0;
//    int result = a/b;
//    System.out.println(result);
//}catch (Exception e){
//    System.out.println("You can't / by 0");
//}
//

//try{
//    String txt = "123456";
//    int number = Integer.parseInt(txt);
//    System.out.println(number);
//
//}catch (Exception e){
//    System.out.println("this can't change to int");
//}

        String w = JOptionPane.showInputDialog("plz enter your wight in kg");
        String h = JOptionPane.showInputDialog("plz enter your height in cm");


//        "1cc23"
//        "sdfdsffds"

//                123.0

        try {
            double wight = Double.parseDouble(w);
            double heigtht = Double.parseDouble(h);
            double result = (1.3 * wight) / Math.pow(heigtht/100,2.5);
           JOptionPane.showMessageDialog(null,"result is :"+String.format("%.2f",result));

        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Input");
        }





    }
}
