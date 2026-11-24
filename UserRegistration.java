public class UserRegistration {
    
    void register(String name, int userId) {
        System.out.println("Registered user: " + name + " with ID: " + userId);
    }

    void register(int userId, String name) {
        System.out.println("Registered ID: " + userId + " for user: " + name);
    }
}

class Main {
    public static void main(String[] args) {
        UserRegistration r = new UserRegistration();

        r.register("abhi", 10);
        r.register(10, "hari");
    }
}