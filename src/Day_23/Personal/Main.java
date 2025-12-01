package Day_23.Personal;

public class Main {
    public static void main(String[] args) {
        Personal p1 = new Personal("Ali","Herat Afghanistan", "+93 799 595 959");
        Student s1 = new Student(p1,"079999999");

        System.out.println(  p1.toString());
        System.out.println(  s1.toString());



    }
}
