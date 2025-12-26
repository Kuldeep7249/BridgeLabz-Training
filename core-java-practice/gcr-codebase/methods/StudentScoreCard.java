import java.util.Scanner;

public class StudentScoreCard {

    static int[][] generatePCM(int n) {
        int[][] pcm = new int[n][3];
        for (int i = 0; i < n; i++) {
            pcm[i][0] = 10 + (int)(Math.random() * 90);
            pcm[i][1] = 10 + (int)(Math.random() * 90);
            pcm[i][2] = 10 + (int)(Math.random() * 90);
        }
        return pcm;
    }

    static double[][] calculateResults(int[][] pcm) {
        int n = pcm.length;
        double[][] result = new double[n][3];
        for (int i = 0; i < n; i++) {
            double total = pcm[i][0] + pcm[i][1] + pcm[i][2];
            double average = total / 3;
            double percentage = (total / 300) * 100;

            result[i][0] = Math.round(total * 100.0) / 100.0;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }

    static void displayScorecard(int[][] pcm, double[][] result) {
        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\tPer%");
        for (int i = 0; i < pcm.length; i++) {
            System.out.println(
                    (i + 1) + "\t" +
                    pcm[i][0] + "\t" +
                    pcm[i][1] + "\t" +
                    pcm[i][2] + "\t" +
                    result[i][0] + "\t" +
                    result[i][1] + "\t" +
                    result[i][2]
            );
        }
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        int n = r.nextInt();

        int[][] pcm = generatePCM(n);
        double[][] result = calculateResults(pcm);
        displayScorecard(pcm, result);
    }
}
