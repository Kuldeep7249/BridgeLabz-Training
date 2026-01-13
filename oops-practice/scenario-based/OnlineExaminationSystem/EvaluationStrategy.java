package OnlineExaminationSystem;

import java.util.List;
import java.util.Map;

public interface EvaluationStrategy {
    void calculateResult(List<Question> q,List<Character>a);
}
