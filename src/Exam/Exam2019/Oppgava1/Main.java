package Exam.Exam2019.Oppgava1;

public class Main {
    public static void main(String[] args) {


        System.out.println("========== part  1 =========");
        for (int  i = 0 ; i<=100 ; i+=3){

            System.out.print(i+" ");

        }
        System.out.println();
        System.out.println("========== part  2 =========");

        int i = 2;
        int sum=0;
        int count = 0;
        while (i<=100){
            if (i%2==0){
                sum+=i;
                count++;
            }
            i++;
        }
        double avg  = (double) sum / count;
        System.out.println(count);
        System.out.println(sum);
        System.out.println(avg);
    }
}
