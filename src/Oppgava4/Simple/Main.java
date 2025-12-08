package Oppgava4.Simple;

import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Object waiter1 = new Waiter("Ali", 20, 2003.33);
        Object waiter2 = new Waiter("Sajad", 30, 40000);
        Object chef1 = new Chef("Ahmad", 22, 100000);


        ArrayList<Object> OBJList = new ArrayList<>();

        OBJList.add(waiter1);
        OBJList.add(waiter2);
        OBJList.add(chef1);

        for (Object emp : OBJList) {
            System.out.println(emp.toString());
            if (emp instanceof Waiter){
                ((Waiter) emp).takeTips(400);
            }




        }
    }
}
