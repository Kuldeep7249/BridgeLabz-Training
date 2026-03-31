import java.util.Scanner;

public class CharacterFrequency {

    static String[] findFrequency(String text) {

        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        for (int i = 0; i < freq.length; i++) {
            freq[i] = 1;
        }

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') {
                continue;
            }

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                count++;
            }
        }

        String[] result = new String[count];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " : " + freq[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner r = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = r.nextLine();

        String[] output = findFrequency(input);

        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }

        r.close();
    }
}
