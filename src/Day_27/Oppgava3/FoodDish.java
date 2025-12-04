package Day_27.Oppgava3;

import java.util.ArrayList;

public class FoodDish {
   private String name;
    private ArrayList<Ingredient> ingredientList = new ArrayList<>();
    private static int dishesServed=0;

    public FoodDish(String name) {
        this.name = name;
        ingredientList = new ArrayList<>();
    }

    public void addIngredient(Ingredient ingredient){
        ingredientList.add(ingredient);
    }

    public void printReceipe(){
        for (int i = 0 ; i < ingredientList.size() ; i++){
            System.out.println(ingredientList.get(i));
        }
    }


    public void serveDish(){
        dishesServed++;
    }

    public void printServeDish(){
        System.out.println("This dish served in this time: "+dishesServed);
    }

}
