package Day_28.TiciteV3;

import javax.swing.*;

public class AirportTicketSystemV3 {
    public static void main(String[] args) {


        JOptionPane.showMessageDialog(null, "Please input ticket information\n");
        String name = JOptionPane.showInputDialog("Plz enter your name:");
        String personNr = JOptionPane.showInputDialog("Plz enter your personal number:");
        String destination = JOptionPane.showInputDialog("Plz enter your destination:");

        TicketV3 t1 = new TicketV3(name, personNr, destination);
        t1.printTicketInfo();


        JOptionPane.showMessageDialog(null, "Please input your information to change the ticket");
        String newName = JOptionPane.showInputDialog("Plz enter new name");
        String newPersonalNr = JOptionPane.showInputDialog("Plz enter new personal number");

        t1.setPassengerInfo(newName, newPersonalNr);

        t1.printTicketInfo();




        JOptionPane.showMessageDialog(null, "Welcome to the checking counter.");
        String newPersonalNr2 = JOptionPane.showInputDialog("Please input the passport person nr.");

        if (t1.checkPersonNr(newPersonalNr2)) {
            JOptionPane.showMessageDialog(null, "Welcome onboard!");
        } else {
            JOptionPane.showMessageDialog(null, "Call to PST!!!");
        }
    }
}
