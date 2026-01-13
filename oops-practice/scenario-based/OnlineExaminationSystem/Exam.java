package OnlineExaminationSystem;

import java.util.List;

public class Exam {
    private Student student;
    private List<Question> questions;
    private List<Character> answwers;

    public Exam(Student student, List<Question> questions, List<Character> answwers) {
        this.student = student;
        this.questions = questions;
        this.answwers = answwers;
    }
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public List<Character> getAnswwers() {
        return answwers;
    }

    public void setAnswwers(List<Character> answwers) {
        this.answwers = answwers;
    }
}
