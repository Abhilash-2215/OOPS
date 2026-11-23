public class Device {
    String powerSource = "Device powered on";

    public void turn_on() {
        System.out.println(powerSource);
    }
}

class Mobile extends Device {
    double screen_size = 62.0;

    public void makecall() {
        System.out.println("Calling...");
    }
}

class Android extends Mobile {
    public void openPlayStore() {
        System.out.println("Play Store opened");
    }
}

class iPhone extends Mobile {
    public void openAppStore() {
        System.out.println("App Store opened");
    }
}

class Main {
    public static void main(String[] args) {

        iPhone i = new iPhone();
        Android a = new Android();
        i.turn_on();
        i.makecall();
        i.openAppStore();

        a.turn_on();
        a.makecall();
        a.openPlayStore();
    }
}