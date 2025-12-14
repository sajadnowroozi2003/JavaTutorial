package Day_31.Oppgava1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        while (true) {
            String input1 = JOptionPane.showInputDialog("Enter a first number or q for exit:");
            if (input1.equalsIgnoreCase("q")) {
                System.out.println("Bay Bay");
                break;
            }
            String input2 = JOptionPane.showInputDialog("Enter a secund number:");
            try {
                Double number1 = Double.parseDouble(input1);
                Double number2 = Double.parseDouble(input2);

                System.out.println("Sum of two numbers is :" + (number1 + number2));
                System.out.println("Mulitpli of two numbers is :" + (number1 * number2));
                if (number1 > number2) {
                    System.out.println(number1 - number2);
                } else {
                    System.out.println(number2 - number1);

                }

            }

  catch(Exception e){
      System.out.println("Invalid inout." +
              " just enter number");
        }
    }
    }
}
