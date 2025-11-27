package Day_22;

public class Person {
//    public همه جا قابل دسترس
//    private
//    protected

    private String name;
    private String lastName;
    private int birthday;
    public int wight;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + birthday +
                ", wight=" + wight +
                '}';
    }

    Person(String name, String lastName, int birthday, int wight){
    this.name= name;
    this.lastName=lastName;
    this.birthday=birthday;
    this.wight=wight;
    }

private int checkAge (int b){
       return  2025-b;

}
     void printInfo(){
        System.out.println("Hello");
        System.out.println("Name is :"+name);
        System.out.println("Last Name is :"+lastName);
        System.out.println("Your Age is :"+checkAge(birthday));
    }

    public void setName(String name){
            this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setBirthday(int birthday){
        if(birthday < 0 || birthday > 130){
            System.out.println("Invalid input");
        }
        this.birthday=birthday;
    }

    public int getBirthday(){
        return birthday;
    }





}
