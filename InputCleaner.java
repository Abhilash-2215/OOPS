public class InputCleaner {
    public static void main(String[] args) {
        String username = " JavaDeveloper ";

        String cleanedUsername = username.trim();

        System.out.println("Original Length: " + username.length());
        System.out.println("Cleaned Length: " + cleanedUsername.length());
        System.out.println("Cleaned Username: " + cleanedUsername);
    }
}