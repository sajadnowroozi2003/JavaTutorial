package Day_32.Exam2024.Oppgava3;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> animalsList = new ArrayList<>();
        animalsList.add("cat");
        animalsList.add("dog");
        animalsList.add("lion");
        animalsList.add("zibra");
        animalsList.add("fox");


guessTheAnimal(animalsList);
    }


    public static void guessTheAnimal(ArrayList<String> animals){
        while (true){
            String input = JOptionPane.showInputDialog("Guess this animal name. or give up (q for exit).");
            if (input.equalsIgnoreCase("q")){
                JOptionPane.showMessageDialog(null,"Bye Bye🤞");
                break;
            }else {

                if (animals.contains(input.toLowerCase())){
                    System.out.println("You found the animal.");
                }else
                {
                    System.out.println("you got wrong.");
                }
            }

        }
    }
}
