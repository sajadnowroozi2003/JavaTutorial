package Exam.Exam2024.Oppgava4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GreenhouseGas> gases  = new ArrayList<>();
        GreenhouseGas CO2 = new GreenhouseGas("CO2",1,38869.00);
        GreenhouseGas Metan = new GreenhouseGas("Metan",25,171.27);
        GreenhouseGas Dinitrogenoksid = new GreenhouseGas("Dinitrogenoksid",298,8.44);

        gases.add(CO2);
        gases.add(Metan);
        gases.add(Dinitrogenoksid);

        double total = 0.0;
        for (GreenhouseGas gas : gases){
            System.out.println(gas);
            total+=gas.calculateEquivalent();
        }


        System.out.println("Total CO2e is :"+total);
    }
}
