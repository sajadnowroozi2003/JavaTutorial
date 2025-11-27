package Day_22;

public class Employee extends Person{

    int salary;
Employee(String name, String lastName, int age,int wight,int salary){
    super(name,lastName,wight,age);
    this.salary=salary;

}

    @Override
    public String toString() {
        return "Employee{" +
                "Name="+super.getName()+
                "Last name="+super.getLastName()+
                "Age="+super.getBirthday()+
                "salary=" + salary +
                ", wight=" + wight +
                '}';
    }
}
