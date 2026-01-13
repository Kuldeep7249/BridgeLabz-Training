package OnlineExaminationSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student s=new Student(1,"Kuldeep Singh");
        ArrayList<Question> question=new ArrayList<>();
        List<Question> questionList = new ArrayList<>();

        questionList.add(new Question(
                "Q1",
                "Which language is platform independent?",
                Arrays.asList("A. Java", "B. Python", "C. C++", "D. JavaScript"),
                'A'
        ));

        questionList.add(new Question(
                "Q2",
                "Which keyword is used to inherit a class in Java?",
                Arrays.asList("A. this", "B. super", "C. extends", "D. implements"),
                'C'
        ));

        questionList.add(new Question(
                "Q3",
                "Which collection does NOT allow duplicate elements?",
                Arrays.asList("A. List", "B. Set", "C. ArrayList", "D. LinkedList"),
                'B'
        ));

        questionList.add(new Question(
                "Q4",
                "Which exception is checked at compile time?",
                Arrays.asList("A. NullPointerException", "B. ArithmeticException", "C. IOException", "D. ArrayIndexOutOfBoundsException"),
                'C'
        ));

        questionList.add(new Question(
                "Q5",
                "Which OOP concept supports multiple forms?",
                Arrays.asList("A. Encapsulation", "B. Inheritance", "C. Polymorphism", "D. Abstraction"),
                'C'
        ));

        questionList.add(new Question(
                "Q6",
                "Which method is the entry point of a Java program?",
                Arrays.asList("A. start()", "B. run()", "C. main()", "D. init()"),
                'C'
        ));

        questionList.add(new Question(
                "Q7",
                "Which Java collection is synchronized?",
                Arrays.asList("A. ArrayList", "B. HashMap", "C. Vector", "D. HashSet"),
                'C'
        ));

        questionList.add(new Question(
                "Q8",
                "Which keyword prevents inheritance?",
                Arrays.asList("A. static", "B. final", "C. private", "D. protected"),
                'B'
        ));

        questionList.add(new Question(
                "Q9",
                "Which interface provides random access in Java?",
                Arrays.asList("A. Serializable", "B. Cloneable", "C. RandomAccess", "D. Comparable"),
                'C'
        ));

        questionList.add(new Question(
                "Q10",
                "Which Java feature allows method overriding?",
                Arrays.asList("A. Encapsulation", "B. Inheritance", "C. Abstraction", "D. Interface"),
                'B'
        ));
        List<Character> answers=new ArrayList<>();
        Scanner r=new Scanner(System.in);
        for(int i=0;i<questionList.size();i++){
            System.out.println(questionList.get(i).getQuestion());
            System.out.println("(A). "+questionList.get(i).getOptions().get(0));
            System.out.println("(B). "+questionList.get(i).getOptions().get(1));
            System.out.println("(C). "+questionList.get(i).getOptions().get(2));
            System.out.println("(D). "+questionList.get(i).getOptions().get(3));
            System.out.println("the Answer of this Question is :");
            answers.add(r.next().charAt(0));
        }
        Exam e=new Exam(s,questionList,answers);
        Result result=new Result();
        result.calculateResult(questionList,answers);
    }
}
