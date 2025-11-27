package Day_21;

import Day_22.Person;

public class Main {
    public static void main(String[] args) {
        ProductManager pm = new ProductManager();

Product p4 = new Product("Keyboard",800.50);
Product p5 = new Product("HeadPhone",1800.10);
ProductManager.productList.add(p4);
ProductManager.productList.add(p5);
        System.out.println("Cup price is: "+pm.findPrice("Cup"));
        System.out.println("LabTop price is: "+pm.findPrice("LabTop"));
        System.out.println("LapTop price is: "+pm.findPrice("laptop"));
        System.out.println("Class price is: "+pm.findPrice("Glass"));
        System.out.println(pm.findPrice("HeadPhone"));


    }
}
