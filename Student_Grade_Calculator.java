import java.sql.SQLOutput;
import java.util.Arrays;

class Students{
    private String name;
    private double rollnumber;
    private int[] marks;

    public Students(String name, double rollnumber, int[] marks){
        this.name = name;
        this.rollnumber = rollnumber;
        this.marks = marks;
    }
    public double calcAverage() {
        double average = 0;
        for(int i = 0; i < marks.length; i++){
            average += marks[i];
        }
        return (double) average / marks.length;
    }

    public String getGrade() {
        double avg = calcAverage();
            if(avg >= 90) return "A+";
            else if (avg >= 80) return "A";
            else if (avg >= 70) return "B+";
            else if (avg >= 60) return "B";
            else if (avg >= 50) return "C+";
            else if (avg >= 40) return "D+";
            else return "F";

    }
    public void display() {
        System.out.println("Name       : " + name);
        System.out.println("Rollnumber : " + rollnumber);
        System.out.printf("Average    : %.2f%n", calcAverage());
        System.out.println("Grade      : " + getGrade());
        System.out.println("----------------------------");
    }
}




public class Student_Grade_Calculator {
    public static void main(String[] args) {
        Students students = new Students("A", 90, new int[]{2, 3, 4, 5});
        Students  students1 = new Students("B", 80, new int[]{2, 3, 4, 5});
        Students  students2 = new Students("C", 60, new int[]{2, 3, 4, 5});

        students.display();
        students1.display();
        students2.display();


    }
}
