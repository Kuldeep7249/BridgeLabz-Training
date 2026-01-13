package OnlineExaminationSystem;

import java.util.List;

public class Question {

    private String questionNumber;
    private String question;
    private List<String> options;
    private char answer; // correct option (A/B/C/D)

    public Question(String questionNumber, String question, List<String> options, char answer) {
        this.questionNumber = questionNumber;
        this.question = question;
        this.options = options;
        this.answer = answer;
    }

    public String getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(String questionNumber) {
        this.questionNumber = questionNumber;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public char getAnswer() {
        return answer;
    }

    public void setAnswer(char answer) {
        this.answer = answer;
    }
}
