class Main{
    public static void main(String[] args){



// Simple Method
        MethodsInJava.printName();


// Method with  one Parameters
        MethodsInJava.printName2("ahmad");


// Multi-parameter method
        MethodsInJava.printName3("Ahmad","Ahmadi",29,"+93799222222");
        MethodsInJava.printName3("Ehsan","Mohammadi",19,"+93799333333");



// Save the value of return type of method in a variable
        int test= MethodsInJava.sumNumber(5,132);
        System.out.println(test);




// call a return type of method in a println  
        System.out.println(MethodsInJava.sumNumber(55,38));
    }
}