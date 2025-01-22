import java.util.Scanner;

public class TextAnalysis {
    public int countWords(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }

    public String findAndReplace(String text, String toFind, String toReplace) {
        return text.replace(toFind, toReplace);
    }

    public String extractFirstSentence(String text) {
        int endIndex = text.indexOf('.');
        if (endIndex != -1) {
            return text.substring(0, endIndex + 1).trim();
        }
        return text;
    }

    public String convertToUppercase(String text) {
        return text.toUpperCase();
    }

    public String convertToLowercase(String text) {
        return text.toLowerCase();
    }

    public static void main(String[] args) {
        TextAnalysis analysis = new TextAnalysis();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a paragraph of text:");
        String text = scanner.nextLine();

        System.out.println("1. Count the number of words: " + analysis.countWords(text));

        System.out.print("2. Enter the word to find: ");
        String toFind = scanner.nextLine();
        System.out.print("Enter the word to replace it with: ");
        String toReplace = scanner.nextLine();
        System.out.println("Text after replacement: " + analysis.findAndReplace(text, toFind, toReplace));

        System.out.println("3. First sentence: " + analysis.extractFirstSentence(text));

        System.out.println("4. Text in uppercase: " + analysis.convertToUppercase(text));
        System.out.println("Text in lowercase: " + analysis.convertToLowercase(text));

        scanner.close();
    }
}

