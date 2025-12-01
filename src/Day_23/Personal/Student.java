package Day_23.Personal;

import Day_23.Animal;

public class Student {
    Personal personalStudent;

    String studentNumber;
   Student(Personal p, String studentNumber){
       this.personalStudent=p;
       this.studentNumber=studentNumber;
   }

    @Override
    public String toString() {
        return "Student{" +
                "personalStudent=" + personalStudent +
                ", studentNumber='" + studentNumber + '\'' +
                '}';
    }
}
