package Day_14;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[]WordList =new String[5];
        System.out.println("Plz Enter Five Words:");

//        Step -1
        for (int i = 0 ; i<WordList.length; i++){
            WordList[i] = scan.nextLine();
        }

//        Step -2
        for (int i = 0 ; i < WordList.length ; i++){
            System.out.print("\t"+WordList[i]+"\t");
        }
        System.out.println();

//        Step -3
        for (int i = 0 ; i < WordList.length ; i++){
            System.out.print("\t"+WordList[i].length()+"\t");
        }

        System.out.println();

//        Step -4
        int max = WordList[0].length();
        for (int i = 0 ; i < WordList.length ; i++){
            if(WordList[i].length() > max){
                max = WordList[i].length();
            }
        }
        System.out.print("Max is: "+max);

        System.out.println();

//        Step -5
        int min = WordList[0].length();
        for (int i = 0 ; i < WordList.length ; i++){
            if(WordList[i].length() < min){
                min = WordList[i].length();
            }
        }
        System.out.print("Minimum is: "+min);
        System.out.println();

//        Step -6

        System.out.println("=======This is Step 6 Print World to be started with a and A=======");
        for (int i = 0 ; i < WordList.length ; i++){
            if(WordList[i].toLowerCase().startsWith("a")){
                System.out.println(WordList[i]);
            }
        }








// New EXAMPLE

        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<Integer> ageList = new ArrayList<>();

String inputName="";
int inputAge=0;
        while (true){
            System.out.print("Plz enter your name (q to exit): ");
            inputName = scan.nextLine();


            if (inputName.equals("q")){
                break;
            }
            System.out.print("plz enter your age: ");
          inputAge = scan.nextInt();
          scan.nextLine();

          nameList.add(inputName);
          ageList.add(inputAge);
        }

        System.out.println("Program finished");
        System.out.println("Names List is : "+nameList);
        System.out.println("Age List is : "+ageList);



        int userInput = 0;
        while (true){
            System.out.println("Enter any number (0 to exit): ");
            userInput= scan.nextInt();

            if (userInput==0){
                break;
            }
        }


    }
}
