package Exam.Exam2018.Oppgava3;

public class Liste {


//    int [] arr  = {1,2,4,2,4,5,6,5,67,78,1,-23};
    public static int CountPossetiveNumber(int [] arr){
int count =0;
//for (int i = 0; i<arr.length ; i++)
//{
//    if (arr[i] > 0){
//        count++;
//    }
//}
        for (int num : arr){
            if (num > 0){
                count++;
            }

        }
return count;
    }


    public static int FoundTargetNumber(int [] arr , int target){
        int count = 0;

        for (int num : arr){
            if (num == target){
                count++;
            }
        }
        return count;

    }

    public static int MaxNumber (int [] NumberList){
        int max = NumberList[0];
        for (int num : NumberList){
            if (num > max){
                max=num;
            }
        }
return max;
    }


}
