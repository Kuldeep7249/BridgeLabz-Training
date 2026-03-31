package scenario.StreamBuzz;
import java.util.*;

public class Program {

    public void RegisterCreator(CreatorStats record) {
        CreatorStats.engagementBoard.add(record);
    }

    public Dictionary<String, Integer> GetTopPostCounts(List<CreatorStats> records, double likeThreshold) {

        Dictionary<String, Integer> result = new Hashtable<>();

        for (CreatorStats cs : records) {
            int count = 0;
            for (double likes : cs.weeklyLikes) {
                if (likes >= likeThreshold) {
                    count++;
                }
            }
            if (count > 0) {
                result.put(cs.creatorName, count);
            }
        }
        return result;
    }

    public double CalculateAverageLikes() {
        double sum = 0;
        int count = 0;

        for (CreatorStats cs : CreatorStats.engagementBoard) {
            for (double likes : cs.weeklyLikes) {
                sum += likes;
                count++;
            }
        }

        if (count == 0)
            return 0;

        return sum / count;
    }
}
