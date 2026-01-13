package OnlineExaminationSystem;

import java.util.List;
import java.util.Map;

public class Result implements EvaluationStrategy {
    @Override
    public void calculateResult(List<Question> q,List<Character>a) {
        int correct=0;
        for(int i=0;i<a.size();i++){
            if(q.get(i).getAnswer()==a.get(i)){
                correct++;
            }
        }
        System.out.println("Result is : "+ correct+"/"+q.size());
    }
}
