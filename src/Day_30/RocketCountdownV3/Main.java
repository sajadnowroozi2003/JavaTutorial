package Day_30.RocketCountdownV3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
while (true){
    String  input  = JOptionPane.showInputDialog("Plz Enter Your number.");
    try {
        int number = Integer.parseInt(input);
        if (number>=0){
            RocketCountdownV3.countDown(number);
            break;
        }else {
            JOptionPane.showMessageDialog(null,"your number is under 0. plz Enter more than 0.");
        }

    }catch (Exception e){
        JOptionPane.showMessageDialog(null,"Invalid input please Enter number.");
    }


}

    }
}
