package ch04;

public class test_superclass {

    public static void main(String[] args) {
        // Test superclass
        System.out.println("Test superclass");

        Employee[] staff = { new Employee("Mathieu", 10000.0), new Employee("Alain", 20000.0)};
        Manager[] managerStaff = {new Manager("George", 50000.0)};

        managerStaff[0].setBonus(100);

        double sum = 0;
        for (Employee empl : staff) {
            sum += empl.getSalary();
        }

        System.out.println("Total salary = " + sum);

    }
}

class Employee {
    private String name = "";
    private double salary = 0.0;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    private String getName(){
        return this.name;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    private void setName(String name){
        this.name = name;
    }

}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary){
        super(name,salary);
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalary() {
        return getSalary() + bonus;
    }
}
