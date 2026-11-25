public class WordAnalyzer {
    public static void main(String[] args) {
        String word = "banana";

        int firstA = word.indexOf('a');
        int lastA = word.lastIndexOf('a');

        int firstN = word.indexOf('n');
        int lastN = word.lastIndexOf('n');

        System.out.println("First occurrence of 'a': " + firstA);
        System.out.println("Last occurrence of 'a': " + lastA);

        System.out.println("First occurrence of 'n': " + firstN);
        System.out.println("Last occurrence of 'n': " + lastN);
    }
}