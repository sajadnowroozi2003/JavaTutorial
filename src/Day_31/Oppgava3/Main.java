package Day_31.Oppgava3;

public class Main {
    public static void main(String[] args) {
//        Test klassene du lagde i a og b i en main-metode. 
//        Lag en matrett med navn pancakes. 
//        Legg til minst 4 ingredienser (melk, mel, egg og salt) 
//        Kall på metoden printReceipie() 


        FoodDish panCakes = new FoodDish("PanCakes");
        panCakes.serveDish();
        panCakes.serveDish();
        panCakes.serveDish();
        panCakes.serveDish();
        panCakes.serveDish();
        panCakes.serveDish();
        panCakes.serveDish();
        Ingredient ingredient1 = new Ingredient("Milk",1,"Box");
        Ingredient ingredient2 = new Ingredient("Mel",2,"L");
        Ingredient ingredient3 = new Ingredient("Egg",5,"Stk");
        Ingredient ingredient4 = new Ingredient("Salt",1.5,"Ts");



        panCakes.addIngredient(ingredient1);
        panCakes.addIngredient(ingredient2);
        panCakes.addIngredient(ingredient3);
        panCakes.addIngredient(ingredient4);


        panCakes.printRecepie();

        System.out.println("===========DishServed=========");
        System.out.println(panCakes.getDishesServed());

    }
}
