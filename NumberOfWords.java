import java.util.Scanner;

/**
 * number of words
 * @author Suyash Patel
 */
public class NumberOfWords {

    /**
     * count words
     * @param str string
     * @return number of words
     */
    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String[] words = str.split("\\s+");
        return words.length;
    }

    /**
     * main method
     * @param args arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        int wordCount = countWords(input);
        System.out.println("Number of words in the string: " + wordCount);

        scanner.close();
    }
}

