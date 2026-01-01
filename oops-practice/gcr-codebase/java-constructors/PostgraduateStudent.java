import java.util.Scanner;

public class PostgraduateStudent extends Student {
    private String specialization;

    PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization){
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void show(){
        System.out.println("Roll: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
    }

    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        PostgraduateStudent p = new PostgraduateStudent(201, "Carol", 9.2, "CS");
        p.show();
    }
}