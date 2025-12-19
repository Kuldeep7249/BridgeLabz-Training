import java.util.Scanner;

public class SumOfNaturalNumbers2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a Natural Number");
            return;
        }
        int sumFor = 0;
        int i = 1;
        for(int  k=0;k<=n;k++){
            sumFor += k;
        }
        int sumFormula = n * (n + 1) / 2;

        System.out.println("Sum using while loop: " + sumFor);
        System.out.println("Sum using formula: " + sumFormula);
        System.out.println("Both results are correct: " + (sumFor == sumFormula));
        sc.close();
    }
}
