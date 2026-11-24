public class Employeee {
    double baseSalary;

    double calculateSalary() {
        return baseSalary;
    }
}

class SalesEmployee extends Employeee {
    double bonus;

    @Override
    double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
}

class Main {
    public static void main(String[] args) {
        SalesEmployee s = new SalesEmployee();

        s.baseSalary = 50000;
        s.bonus = 10000;

        System.out.println("Total Salary: " + s.calculateSalary());
    }
}