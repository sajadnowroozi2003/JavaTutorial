package Day_27;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

    String salary = JOptionPane.showInputDialog("Plz Enter your salary in one year: ");
    try {
            Double salaryDuble = Double.parseDouble(salary);
double bonus = 0.0;
double totalSalary=0.0;

if (salaryDuble < 80000){
    bonus = 0;
    totalSalary = salaryDuble+bonus;

}else if (salaryDuble >=80000 && salaryDuble <=200000){
    bonus  = salaryDuble*0.10;
    totalSalary  = salaryDuble+bonus;
}else {
    bonus = salaryDuble*0.15;
    totalSalary= salaryDuble+bonus;
}

        System.out.println("Your Bonus is :"+bonus);
        System.out.println("Your Total salary is :"+totalSalary);
    }catch (Exception e) {
        System.out.println("just enter number.");
    }



    }
}
