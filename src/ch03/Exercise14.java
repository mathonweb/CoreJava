package ch03;

import java.util.Arrays;
import java.util.Comparator;

public class Exercise14 {

    public static void main(String[] args) {
        //Exercise #14
        System.out.println("Exercise #14");

        // Create different employees
        employee employee1 = new employee("Mathieu", 10000.00);
        employee employee2 = new employee("Mathieu", 50000.00);
        employee employee3 = new employee("Marc", 15000.00);
        employee employee4 = new employee("Julie", 20000.00);
        employee employees[] = {employee1, employee2, employee3, employee4};

        // Sort them with salary
        employee employeesSorted[] = sort(employees);

        // Print the result
        for(employee item : employeesSorted){
            System.out.println("Name = " + item.getName() + "  " + "Salary= " + item.getSalary());
        }

        System.out.println("Now reverse order");

        // Sort them in reverse order
        employeesSorted = reverseSort(employees);

        // Print the result
        for(employee item : employeesSorted){
            System.out.println("Name = " + item.getName() + "  " + "Salary= " + item.getSalary());
        }

    }

    // Define the sort method
    static employee[] sort(employee employees[]){

        Arrays.sort(employees, Comparator .comparing(employee::getName) .thenComparing(employee::getSalary));

        return employees;
    }

    // Define the reverse order sort method
    static employee[] reverseSort(employee employees[]){

        Arrays.sort(employees, Comparator .comparing(employee::getName) .thenComparing(employee::getSalary).reversed());

        return employees;
    }

}

// Definition of the employee class
class employee {
    // Define the variables
    private String name;
    private Double salary;

    // Define class constructor
    employee(String name, Double salary){
        setName(name);
        setSalary(salary);
    }

    // Define the setters
    void setName(String name) {
        if(!name.isEmpty())
            this.name = name;
    }

    void setSalary(Double salary) {
        if(!salary.isNaN()){
            this.salary = salary;
        }
    }

    // Define the getters
    String getName(){
        return this.name;
    }

    Double getSalary(){
        return this.salary;
    }

}
