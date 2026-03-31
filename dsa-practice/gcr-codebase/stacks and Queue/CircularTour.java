import java.util.*;

class PetrolPump {
    int petrol;
    int distance;

    PetrolPump(int petrol, int distance) {
        this.petrol = petrol;
        this.distance = distance;
    }
}

public class CircularTour {
    public static int findStartingPoint(PetrolPump[] pumps) {
        int n = pumps.length;
        Queue<Integer> queue = new LinkedList<>();
        int surplus = 0;
        int start = 0;
        int end = 0;

        while (queue.size() < n) {
            surplus += pumps[end].petrol - pumps[end].distance;
            queue.offer(end);

            while (surplus < 0 && !queue.isEmpty()) {
                int idx = queue.poll();
                surplus -= pumps[idx].petrol - pumps[idx].distance;
                start = idx + 1;
            }

            end = (end + 1) % n;
            if (end == start) break;
        }

        return queue.size() == n ? start : -1;
    }

    public static void main(String[] args) {
        PetrolPump[] pumps = {
            new PetrolPump(6, 4),
            new PetrolPump(3, 6),
            new PetrolPump(7, 3)
        };

        System.out.println(findStartingPoint(pumps));
    }
}
