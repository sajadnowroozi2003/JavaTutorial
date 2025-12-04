package Exam.Exam2018.Oppgava3;

public class Main {
    public static void main(String[] args) {

        int  [] array ={1,2,3,4,5,4,3,2,-3,-4,-5,-54,-23,-41,23,4,5,6,7,78,887,43};
        System.out.println("======= Methode 1 =======");
        System.out.println(Liste.CountPossetiveNumber(array));


        System.out.println("======= Methode 2 =======");
        System.out.println(Liste.FoundTargetNumber(array,4));


        System.out.println("======= Methode 3 =======");
        System.out.println(Liste.MaxNumber(array));
    }
}
