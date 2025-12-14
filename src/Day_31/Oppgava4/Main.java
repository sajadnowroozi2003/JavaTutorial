package Day_31.Oppgava4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TipJar tipJar  = new TipJar();

        ArrayList<Employee> employees  = new ArrayList<>();

        Waiter waiter1 =  new Waiter("Ahmad",23,25000.0,tipJar);
        Waiter waiter2 =  new Waiter("Nasir",27,40000.0,tipJar);
        Waiter waiter3 =  new Waiter("Trem",47,60000.0,tipJar);

        Chef chef1  = new Chef("Mohammad",22,10_000);


        employees.add(waiter1);
        employees.add(waiter2);
        employees.add(waiter3);
        employees.add(chef1);

double totlaSalalry = 0;
int WaiterCount = 0;
        for (Employee employee: employees){
            System.out.println(employee);

            if (employee instanceof Waiter){
                WaiterCount++;
                ( (Waiter) employee).takeTips(2344);
            }

            totlaSalalry+=employee.salary;

        }

        System.out.println("Total Salary is: "+totlaSalalry);
        System.out.println("Each employee get :"+(tipJar.divideTips(employees.size())));


    }
}
