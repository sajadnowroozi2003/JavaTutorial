package Day_30.RocketCountdownV5;

import Day_30.RocketCountdownV3.RocketCountdownV3;

import javax.swing.*;

public class InputManager {

    public static void getValidInput(){
        int count = 0;
        while (true){
            String  input  = JOptionPane.showInputDialog("Plz Enter Your number.");
            try {
                int number = Integer.parseInt(input);
                if (number>=0){
                    RocketCountdownV3.countDown(number);
                    count++;
                    String ask= JOptionPane.showInputDialog("Do you want to continue y for yes n for no.");
                    if (ask.equalsIgnoreCase("n")){
                        break;
                    }

                }else {
                    JOptionPane.showMessageDialog(null,"your number is under 0. plz Enter more than 0.");
                }

            }catch (Exception e){
                JOptionPane.showMessageDialog(null,"Invalid input please Enter number.");
            }
        }
        System.out.println("You throw rocket "+count+" times.");

    }
}
