import java.util.*;
public class Grade_Calculator {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        int physics = r.nextInt();
        int chemistry = r.nextInt();
        int maths = r.nextInt();

        double average = (physics + chemistry + maths) / 3.0;

        String grade;
        String remarks;

        if (average >= 90) {
            grade = "A+";
            remarks = "Excellent";
        } else if (average >= 80) {
            grade = "A";
            remarks = "Very Good";
        } else if (average >= 70) {
            grade = "B";
            remarks = "Good";
        } else if (average >= 60) {
            grade = "C";
            remarks = "Satisfactory";
        } else if (average >= 50) {
            grade = "D";
            remarks = "Pass";
        } else {
            grade = "F";
            remarks = "Fail";
        }

        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}
