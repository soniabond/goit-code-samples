package module4.lesson1;

public class StringProblems {

    public static void main(String[] args) {
        String line = "   Hello    i  am super    cool java   programmer   ";
        //findLongestWord(line);
        //findShortestWord(line);
        reverseString();
    }

    // find the longest word in line
    public static void findLongestWord(String line) {
        String [] words = line.split(" ");
        String longestWord = words[0];
        for (String word: words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("longestWord = " + longestWord);
    }

    // find the shortest word in line
    public static void findShortestWord(String line) {
        line = line.strip();
        String [] words = line.split(" ");
        String shortest = words[0];
        for (String word: words) {
            if (!word.isBlank() && word.length() < shortest.length()) {
                shortest = word;
            }
        }
        System.out.println("shortest = " + shortest);
    }

    // Given a String S, reverse the string without reversing its individual words. Words are separated by dots.
    // https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1

    public static void reverseString() {
        String line = "i.like.this.program.very.much";
        String [] words = line.split("\\.");
        String result = "";
        for (int i = words.length - 1; i >= 1; i--) {
            result += words[i] + ".";
        }
        result += words[0];
        /*for(String word: words) {
            result = word + "." + result;
        }*/
        System.out.println("result = " + result);
    }
}
