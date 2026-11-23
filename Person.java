public class Person {
    String name = "Abhi";
    public void displayPerson()
    {
        System.out.println(name);
    }
    
}
class Employee extends Person
{
    int EmployeeId=12;
    public void displayEmployee()
    {
        System.out.println(EmployeeId);
    }
}
class Manager extends Employee{
    String dept = "CSE";
    public void displayManager()
    {
        System.out.println(dept);
    }
}
class Main{
    public static void main(String[] args) {
        Manager m = new Manager();
        m.displayManager();
        m.displayEmployee();
        m.displayPerson();
    }
}