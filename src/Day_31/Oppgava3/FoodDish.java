package Day_31.Oppgava3;

import java.util.ArrayList;

public class FoodDish {
    private String name;
    ArrayList<Ingredient> ingredientList = new ArrayList<>();
    private static int dishesServed=0;

    public FoodDish(String name) {
        this.name = name;
        ingredientList =new  ArrayList<>();

    }


    public void addIngredient(Ingredient ingredient){
        ingredientList.add(ingredient);
    }

    public void printRecepie(){
        for (Ingredient ingredient : ingredientList){
            System.out.println(ingredient);
        }
    }

    public void serveDish(){
        dishesServed++;
    }

    public int getDishesServed(){
        return dishesServed;
    }



}
