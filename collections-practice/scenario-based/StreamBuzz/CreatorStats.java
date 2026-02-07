package scenario.StreamBuzz;
import java.util.*;

public class CreatorStats {

	public String creatorName;
	public double[] weeklyLikes;
	
	public static List<CreatorStats> engagementBoard = new ArrayList<>();
	
	public CreatorStats(String creatorName, double[] weeklyLikes) {
        this.creatorName = creatorName;
        this.weeklyLikes = weeklyLikes;
    }
}
