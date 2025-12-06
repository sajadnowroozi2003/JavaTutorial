package Exam.Exam2024.Oppgava3;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> animalList =  new ArrayList<>();
        animalList.add("Zibra");
        animalList.add("Cat");
        animalList.add("Dog");
        animalList.add("Duck");
        animalList.add("Lion");
        animalList.add("moss");
guessAnimal(animalList);
    }

    public  static void guessAnimal (ArrayList<String> animals){
        while (true){
            String input  = JOptionPane.showInputDialog("Do you want to guess animal or exit. (q for exit)");
            if (input.equalsIgnoreCase("q")){
                JOptionPane.showMessageDialog(null,"Bay Bay");
                break;
            }

            if (animals.contains(input)){
                JOptionPane.showMessageDialog(null,"Congratuolation🎉, your animal in found.");
        }else {
                JOptionPane.showMessageDialog(null,"Sorry, your animal in not found.");

            }
        }
    }

}
