package Day_12;

import java.util.Scanner;

public class Main {


   public static void main(String[] args){

       Scanner scan = new Scanner(System.in);
       System.out.print("Please Enter Student numbers: ");
       int studentNumber = scan.nextInt();
        scan.nextLine();
        String [] studentName = new String[studentNumber];



       for (int i=0 ; i < studentNumber ; i++){
        System.out.print("Please enter name of studen "+(i+1)+": ");
        studentName[i] = scan.nextLine();

       }

    }
}
