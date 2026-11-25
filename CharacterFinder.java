public class CharacterFinder {
    public static void main(String[] args) {
        String word = "Programming";

        int firstG = word.indexOf('g');
        int positionM = word.indexOf('m');
        int positionZ = word.indexOf('z');

        System.out.println("First occurrence of 'g': " + firstG);
        System.out.println("Position of 'm': " + positionM);
        System.out.println("Position of 'z': " + positionZ);
    }
}