package Day_27.Oppgava1;

import javax.swing.*;

public class Main
{
    public static void main(String[] args) {

        while (true){
            String input1  = JOptionPane.showInputDialog("Plz Enter number 1 or q for exit :");
            if (input1.equalsIgnoreCase("q")){
                System.out.println("Bye.");
                break;
            }
            String input2  = JOptionPane.showInputDialog("Plz Enter number 2 :");
            try{
                double num1 = Double.parseDouble(input1);
                double num2 = Double.parseDouble(input2);

                System.out.println("---- this is + of two numbers ----");
                System.out.println(num1+num2);

                System.out.println("---- this is * of two numbers ----");
                System.out.println(num1*num2);


                System.out.println("---- this is <?> of two numbers ----");
                if (num1 > num2){
                    System.out.printf("Difference: %.2f", num1 - num2);

                }else {
                    System.out.printf("Difference: %.2f", num2 - num1);

                };
            }catch (Exception e){
                System.out.println("Plz just enter number.");
            }


        }
    }
}
