class BreakAndContinue{


    public static void  main(String []arg){


        for (int i=1; i<=10; i++){

            //   if (i==9){
            //     break;

            //   }

            if (!(i %2 == 0)){
                continue;
            }

                System.out.println(i);

        }
                System.out.println("End of Loop");



    }
    

}