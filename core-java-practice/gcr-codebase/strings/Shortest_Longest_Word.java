import java.util.Scanner;

public class Shortest_Longest_Word {
    public static void main(String[] args) {

        Scanner r = new Scanner(System.in);
        String text = r.nextLine();

        String[] words = splitUsingCharAt(text);
        String[][] wordsWithLength = getWordsWithLength(words);
        String[] shortestLongest = findShortestLongest(wordsWithLength);

        System.out.println("Shortest word: " + shortestLongest[0]);
        System.out.println("Longest word: " + shortestLongest[1]);

        r.close();
    }

    static int getStringLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {}
        return count;
    }

    static String[] splitUsingCharAt(String s) {
        int length = getStringLength(s);
        int spaceCount = 0;

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == ' ') spaceCount++;
        }

        String[] words = new String[spaceCount + 1];
        int wordIndex = 0;
        int start = 0;

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == ' ') {
                words[wordIndex] = getSubstring(s, start, i);
                wordIndex++;
                start = i + 1;
            }
        }
        words[wordIndex] = getSubstring(s, start, length);
        return words;
    }

    static String[][] getWordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return result;
    }

    static String[] findShortestLongest(String[][] wordsWithLength) {
        int minLength = Integer.parseInt(wordsWithLength[0][1]);
        int maxLength = Integer.parseInt(wordsWithLength[0][1]);
        String shortest = wordsWithLength[0][0];
        String longest = wordsWithLength[0][0];

        for (int i = 1; i < wordsWithLength.length; i++) {
            int len = Integer.parseInt(wordsWithLength[i][1]);
            if (len < minLength) {
                minLength = len;
                shortest = wordsWithLength[i][0];
            }
            if (len > maxLength) {
                maxLength = len;
                longest = wordsWithLength[i][0];
            }
        }

        return new String[]{shortest, longest};
    }

    static String getSubstring(String s, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += s.charAt(i);
        }
        return result;
    }
}
