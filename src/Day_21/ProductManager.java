package Day_21;

import java.util.ArrayList;

public class ProductManager {

    static ArrayList<Product> productList= new ArrayList<>();

    Product p1 = new Product("Glass",150.20);
    Product p2 = new Product("Cup",50.0);
    Product p3 = new Product("Pen",20.3);

    ProductManager(){
        productList.add(new Product("LabTop",13000.13));
        productList.add(new Product("Mouse",500.9));

       productList.add(p1);
       productList.add(p2);
       productList.add(p3);
    }
    double findPrice(String name){
        for (Product product : productList){
            if(product.name.equals(name)){
                return product.price;
            }
        }
        return -1;
    }
}
