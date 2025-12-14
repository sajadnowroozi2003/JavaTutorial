package Day_32.Exam2024.Oppgava1;

public class Main {
    public static void main(String[] args) {
int [] numbers = {12,3,4,212,-13,-1,-6,-66,34,5};
investigateIntArray(numbers,3);
    }


    public static void investigateIntArray(int [] array, int number){
        System.out.println("=========part 1=========");
        int count=0;
        int count2=0;
        int sum = 0;
        int max =array[0];
        for (int i = 0 ; i < array.length ; i++){
            if (array[i]<0){
                    count++;
            }
            sum+=array[i];

            if (array[i]%number ==0){

               count2++;
            }

            if (max<array[i]){
                max=array[i];
            }

        }
        System.out.println("Number of under 0 is :"+count);

        System.out.println("=========part 2=========");
        System.out.println("Sum of all numbers is: "+sum);
        System.out.println("=========part 3=========");
        System.out.println("Max of these numbers was : "+max);
        System.out.println("=========part 4=========");
        System.out.println("this are this divided numbers: "+count2);

    }

}
