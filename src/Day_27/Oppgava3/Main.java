package Day_27.Oppgava3;

public class Main
{
    public static void main(String[] args) {
/*
        Test klassene du lagde i a og b i en main-metode. 
        Lag en matrett med navn pancakes. 
        Legg til minst 4 ingredienser (melk, mel, egg og salt) 
        Kall på metoden printReceipie() 
*/

        FoodDish panCakes = new FoodDish("PanCakes");
        Ingredient milke = new Ingredient("Milke",1,"L");
        panCakes.addIngredient(milke);
        Ingredient mel = new Ingredient("Mel",1,"kg");
        panCakes.addIngredient(mel);
        Ingredient egg = new Ingredient("Egg",10,"stk");
        panCakes.addIngredient(egg);
        panCakes.addIngredient(new Ingredient("salt",10,"gr"));

        panCakes.printReceipe();


        panCakes.serveDish();
        panCakes.serveDish();
        panCakes.serveDish();
        panCakes.serveDish();

        panCakes.printServeDish();




    }
}
