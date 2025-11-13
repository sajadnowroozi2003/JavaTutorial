import java.util.Arrays;

class Array2D{
    public static void main(String [] args){

//       int  [][] numbers = {
////               0
//               {1,2,3},
////              1
//               {4,5,6},
////               2
//               {7,8,9}
//       };
//
//        for(int i = 0 ; i<numbers.length ; i++){
//
//            for(int j = 0; j< numbers[i].length ; j++){
//                System.out.print(numbers[i][j]+"  ");
//
//            }
//            System.out.println();
//
//        }


        int [][]  sumArray = {

                {1,2,3,4},
                {10,20,30,40},
                {100,200,300,400},
                {55,67,88,33}
        };

        for (int i = 0 ; i < sumArray.length ; i++){

            int sum = 0 ;

            for(int j =0 ; j < sumArray[i].length ;j++){
                sum += sumArray[i][j];

            }

                System.out.print("sum of this row "+i+" is = "+sum);
            System.out.println();

        }










    }
}