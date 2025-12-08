package TaxOppgava;

public class Tax {

    public static double calculateTax(double income){
        double resultTax= 0 ;
        if (income <= 100_000){
            resultTax = 0;
        }else{
            resultTax = (income-100_000)*0.22;
        }
        return resultTax;
    }


    public static double calculateTaxForRetired(double income){

        double resultTax = 0;
        if (income  >= 0 && income <=217_400){
            resultTax = 0;
        }else if (income >= 217_401 && income <=306_050){
            resultTax = ((income-217_400)*1.7)/100;

        }else if (income >= 306_051 && income <=697_150){
            resultTax =   ((income-217_400)*4.0)/100;
        }else if (income >= 697_151 && income <=942_400){
            resultTax =  (income-217_400)*0.137;
        }else if (income >= 942_401 && income <=1_410_750){
            resultTax =  (income-217_400)*0.167;
        }else {
            resultTax =  (income-217_400)*0.177;
        }
        return resultTax;
    }

}
