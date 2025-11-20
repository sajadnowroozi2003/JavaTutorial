package Day_13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        1. آرایه در جاوا چیست و چه کاربردی دارد؟
//        2. چگونه یک آرایه ۵تایی از نوع int تعریف می‌شود؟
//        3. چگونه یک آرایه را هنگام تعریف مقداردهی اولیه می‌کنیم؟ (مثلاً 1 تا 5)
//        4. با استفاده از حلقه for تمام عناصر یک آرایه را چاپ کن.
//        5. برنامه‌ای بنویس که مجموع عناصر یک آرایه را محاسبه کند.
//        6. برنامه‌ای بنویس که بزرگ‌ترین مقدار آرایه را پیدا کند.
//        7. برنامه‌ای بنویس که کوچک‌ترین مقدار آرایه را پیدا کند.
//        8. برنامه‌ای بنویس که میانگین عناصر آرایه را حساب کند.
//        9. تعداد اعداد زوج موجود در آرایه را بشمار.
//        10. برنامه‌ای بنویس که بررسی کند آیا یک مقدار خاص در آرایه وجود دارد یا نه.
//        11. برنامه‌ای بنویس که یک آرایه را در آرایه جدید کپی کند.
//        12. برنامه‌ای بنویس که آرایه را برعکس کند. (Reverse array)
//        13. دومین بزرگ‌ترین مقدار در آرایه را پیدا کن.
//        14. برنامه‌ای بنویس که یک عنصر را با استفاده از ایندکس از آرایه حذف کند.
//        15. تعداد تکرار یک عدد خاص را در آرایه محاسبه کن.
//        16. برنامه‌ای بنویس که دو آرایه را با هم ادغام (Merge) کند.
//        17. آرایه را به صورت صعودی مرتب کن.
//        18. یک آرایه دوبعدی (Matrix) تعریف کن و عناصر آن را چاپ کن.
//        19. مجموع هر سطر ماتریس را محاسبه کن.

                Scanner scan = new Scanner(System.in);
//        int a= 10;



        int [] Q1 =   { 20,34,45,23,33,44,23,22,21};



        int [] numbersList = new int[5];

        System.out.println("Enter Five numbers:");

        for(int i=0 ;i < 5 ; i++ ){
            numbersList[i]=scan.nextInt();
        }




        System.out.println("========Now You Can See All Entered Your Numbers========");
        for(int i = 0 ; i < numbersList.length ; i++){
            System.out.print("\t"+numbersList[i]+"\t");

        }
        System.out.println();





        System.out.println("=##=======This is Sum of All Entered Numbers=======##=");
        int sum = 0;
        for(int i = 0 ; i< numbersList.length ;i++){
            sum+=numbersList[i];
        }
        System.out.println(sum);




        System.out.println("=##=======This is MAX Number in List=======##=");
        int max =  numbersList[0];
        for (int i = 0 ; i < numbersList.length ; i++){
            if(max < numbersList[i]){
                max = numbersList[i];
            }
        }
        System.out.println(max);



        System.out.println("=##=======This is Minimum Number in List=======##=");
        int min = numbersList[0];
        for (int i = 0 ; i < numbersList.length ; i++){
            if(min > numbersList[i]){
                min = numbersList[i];
            }
        }
        System.out.println(min);


//        8. برنامه‌ای بنویس که میانگین عناصر آرایه را حساب کند.

        double avg = 0.0 ;
        for (int i = 0 ; i < numbersList.length ; i++){
        avg = (double) sum/numbersList.length;
        }
        System.out.println("This is the AVG of this list: "+avg);



//        9. تعداد اعداد زوج موجود در آرایه را بشمار.
        int count = 0;
        for (int i = 0 ; i < numbersList.length ; i++){
            if (numbersList[i] %2==0){
                count++;
            }
        }
        System.out.println("Count Pair numbers: "+count);



//        10. برنامه‌ای بنویس که بررسی کند آیا یک مقدار خاص در آرایه وجود دارد یا نه.
int target = 20;
for (int  i = 0 ; i < numbersList.length ; i++){
    if(numbersList[i] == target){
        System.out.println(target);
        break;
    }
}

//        11. برنامه‌ای بنویس که یک آرایه را در آرایه جدید کپی کند.

        int [] copylist = new int[numbersList.length];

        for (int i  = 0 ; i < numbersList.length ; i ++){
            copylist[i] = numbersList[i];
        }


        System.out.println("======= This is Copy List ======");
            for (int  i =0 ; i < copylist.length ; i++){
                System.out.println(copylist[i]);
            }
    }
}
