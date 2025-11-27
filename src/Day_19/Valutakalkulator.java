package Day_19;

import java.util.ArrayList;

public class Valutakalkulator {

    private ArrayList<Valuta> valutakurser = new ArrayList<>();

    public Valutakalkulator(){

      Valuta usd = new Valuta("usd",10.50);
      valutakurser.add(usd);

      Valuta sek = new Valuta("sek" , 98.00);
      valutakurser.add(sek);


      Valuta afg = new Valuta("afg", 650.0);
      valutakurser.add(afg);
    }


    public double beregnkurs(String valuta) {

        for (Valuta v : valutakurser) {
            if (v.getValuta().equals(valuta)) {
                return v.getKurs();
            }
        }
        return -1;
    }





}
