package CourseRegistrationSystem;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student extends Person {
    List<Course> enrolledCourse=new ArrayList<>();
    Map<String,String> grades=new HashMap<>();
    private final int size=3;
    public Student(int id, String name) {
        super(id, name);
    }
    public void enrollCourse(Course c)throws CourseLimitExceedException{
        if(enrolledCourse.size()>size){
            throw new CourseLimitExceedException("Course Enrolled limit Exceed");
        }
        else{
            enrolledCourse.add(c);
            System.out.println("Course enrolled Successfully");
        }
    }
    public void dropCourse(Course c){
        enrolledCourse.remove(c);
        System.out.println("Course deleted Successfully");
    }
    public void addGrade(String c,String g){
        grades.put(c,g);
        System.out.println("Grades Added Successfully");
    }
    public void viewGrades(){
        System.out.println("Grades");
        for(var entry:grades.entrySet()){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
    }
    public void viewEnrolledCourse(){
        System.out.println("\t"+"SubjectId"+"\t"+"subject name");
        for(var i:enrolledCourse){
            System.out.println("\t"+i.getCourseCode()+"\t"+i.getCourseName());
        }
    }
    public void displayInfo(){
        System.out.println("id : "+getId());
        System.out.print("name : "+getName());
    }
}
