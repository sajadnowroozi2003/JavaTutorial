package Day_28.TiciteV3;

import javax.swing.*;

public class TicketV3 {
   private String name;
   private String personalNr;
   private String destination;


    public TicketV3(String name, String personalNr, String destination) {
      if (personalNr.length() == 11){
          this.name = name;
          this.personalNr = personalNr;
          this.destination = destination;
      }
      else {
          JOptionPane.showMessageDialog(null,"Warning: Fødselnr hadde feil lengde.\n" +
              "Passasjer detaljer ble ikke endret.");
    }
    }




 public void setPassengerInfo(String name, String personNr){
        if (personNr.length() == 11){
            this.name = name;
            this.personalNr= personNr;
        }else {
           JOptionPane.showMessageDialog(null,"Warning: Fødselnr hadde feil lengde.\n" +
                   "Passasjer detaljer ble ikke endret.");
        }
 }

 private String getMaskedPersonNr(){
    return personalNr.substring(0,6)+"xxxxx";
 }


 public void printTicketInfo(){
     JOptionPane.showMessageDialog(null,"Ticket info\n" +
             "Name: "+name+"\n" +
             "Person Nr: "+getMaskedPersonNr()+"\n"+
             "Destination: "+destination);
 }

 public boolean checkPersonNr(String personNr){
        if (personNr.equals(this.personalNr)){
            return true;
        }else {
            return false;
        }
 }



}
