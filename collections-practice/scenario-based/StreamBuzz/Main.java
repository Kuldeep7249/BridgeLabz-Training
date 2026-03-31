package scenario.StreamBuzz;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Program p = new Program();

        while (true) {
            System.out.println("1. Register Creator");
            System.out.println("2. Show Top Posts");
            System.out.println("3. Calculate Average Likes");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");

            int choice = sc.nextInt();

            if (choice == 1) {
                sc.nextLine();
                System.out.println("Enter Creator Name:");
                String name = sc.nextLine();

                double[] likes = new double[4];
                System.out.println("Enter weekly likes (Week 1 to 4):");
                for (int i = 0; i < 4; i++) {
                    likes[i] = sc.nextDouble();
                }

                CreatorStats cs = new CreatorStats(name, likes);
                p.RegisterCreator(cs);
                System.out.println("Creator registered successfully");
            }

            else if (choice == 2) {
                System.out.println("Enter like threshold:");
                double threshold = sc.nextDouble();

                Dictionary<String, Integer> result = p.GetTopPostCounts(CreatorStats.engagementBoard, threshold);

                if (result.isEmpty()) {
                    System.out.println("No top-performing posts this week");
                } 
                else {
                    Enumeration<String> keys = result.keys();
                    while (keys.hasMoreElements()) {
                        String key = keys.nextElement();
                        System.out.println(key + " - " + result.get(key));
                    }
                }
            }

            else if (choice == 3) {
                double avg = p.CalculateAverageLikes();
                System.out.println("Overall average weekly likes: " + (int) avg);
            }

            else if (choice == 4) {
                System.out.println("Logging off - Keep Creating with StreamBuzz!");
                break;
            }
        }
        sc.close();
    }
}
