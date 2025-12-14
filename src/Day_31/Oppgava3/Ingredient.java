package Day_31.Oppgava3;

public class Ingredient {
    private String name;
    private double amount;
   private  String unit;

    public Ingredient(String name, double amount, String unit) {
        setName(name);
        setAmount(amount);
        setUnit(unit);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return
        amount+" "+unit+" "+name;
    }
}
