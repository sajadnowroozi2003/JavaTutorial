package Day_30.RocketCountdownV2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String inputNumber = JOptionPane.showInputDialog("Plz Entre your number to count down.");
        int countNumber  = Integer.parseInt(inputNumber);

//        JOptionPane.showMessageDialog(null,RocketCountdownV2.countDown(countNumber));

                RocketCountdownV2.countDown(countNumber);
    }
}
