class Employee {
    String name;
    double baseSalary;

    void displayBasicInfo() {
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    void writeCode() {
        System.out.println(name + " writes code in " + programmingLanguage);
    }
}

class Tester extends Employee {
    String testingTool;

    void runTests() {
        System.out.println(name + " runs tests using " + testingTool);
    }
}

public class Main {
    public static void main(String[] args) {

        Developer dev = new Developer();
        dev.name = "Abhi";
        dev.baseSalary = 50000;
        dev.programmingLanguage = "Java";

        Tester tester = new Tester();
        tester.name = "Ravi";
        tester.baseSalary = 40000;
        tester.testingTool = "Selenium";

        System.out.println("Developer Details:");
        dev.displayBasicInfo();
        dev.writeCode();

        System.out.println();

        System.out.println("Tester Details:");
        tester.displayBasicInfo();
        tester.runTests();
    }
}