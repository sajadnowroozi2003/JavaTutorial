package Day_23.Personal;

public class Personal  {
    String name;
    String address;
    String telephone;

    Personal(String name,String address,String telephone){
        this.name=name;
        this.address=address;
        this.telephone=telephone;
    }

    @Override
    public String toString() {
        return "Personal{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
