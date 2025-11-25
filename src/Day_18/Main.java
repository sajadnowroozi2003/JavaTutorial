package Day_18;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {


//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("sajad");
//        ahmad ,mohammad ,ali ,sajjad ,



        HashMap<String,Integer>  human  = new HashMap<>();
//        Key     >    Value
//        Sajad   >    22
                human.put("Sajad",2003);
                human.put("Ahmad",20);
                human.put("Ali",20);
                human.put("Hassan",30);

        System.out.println("============ Print 1 ============");
        System.out.println(human.get("Ali"));


        System.out.println("============ Print2 ============");
        int brithday = human.get("Sajad");
        System.out.println(2025-brithday);




        System.out.println("============ containsKey ============");

        System.out.println(human.containsKey("Sajad"));
        System.out.println(human.containsKey("Nasir"));

        System.out.println("============ containsValue ============");

        System.out.println(human.containsValue(23));
        System.out.println(human.containsValue(24));

//   Remove one key
        System.out.println("============ Remove ============");
        human.remove("Sajad");

// 1: Print all Keys
        System.out.println("============ Print all Keys ============");
        System.out.println(human.keySet());

// 2: Print all Values
        System.out.println("============ Print all Values ============");
        System.out.println(human.values());

// 3: Print all Keys and Values
        System.out.println("============ Print all Keys and Values ============");
        System.out.println(human.entrySet());

        System.out.println("============ Check Size of Hash Map ============");
        System.out.println(human.size());



        System.out.println("============ Print Hash Map With Loop ============");
//        for (int i = 0 ; i < human.size() ; i++){
//            String key = human.get(i);
//            System.out.println(key+" : "+human.get(key));
//        }

        for (String key : human.keySet()){
            System.out.println(key);
        }

        for (int value : human.values()){
            System.out.println(value);
        }




        System.out.println("============ Clear all Hash Map ============");
        human.clear();


        System.out.println("============ Print Array With For Each ============");

        int [] array = {20,30,4,5,6,56,7,67,78798,998,9};
        for (int temp : array){
            System.out.println(temp);
        }





        System.out.println("============ Real Example  >  schedule System ============");

//        Satureday      >      Java
//        Sunday      >      Programming
//        Math      >      Monday

        HashMap<String,String> schedule = new HashMap<>();
        schedule.put("SatureDay","Java");
        schedule.put("SunDay","Programming");
        schedule.put("MonDay","Math");
        schedule.put("TuesDay","Database");

        System.out.println(schedule.keySet());
        System.out.println(schedule.values());
        System.out.println(schedule.entrySet());

//Sajad   23
        var v1 = "sajad";
        var v2 =  34;
        var v3 =  34.8;
        var v4 = false;

        for (var temp : schedule.entrySet() ){
            System.out.println(temp.getKey() + " Lessen is : "+temp.getValue());
//            System.out.println(temp);


        }


    }
}
