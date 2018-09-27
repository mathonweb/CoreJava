package ch03;

import java.util.Arrays;
import java.util.*;

public class Exercise02 {

    public interface Measurable {
        double getMeasure();
        String getName();
    }

    public class Employee implements Measurable, Comparator<Employee>{
        double salary;
        String name;

        Employee(String name, double salary){

            this.salary = salary;
            this.name = name;
        }

        Employee(){

        }

        public double getMeasure() {
            return salary;
        }

        public String getName() {
            return name;
        }

//        public int compare(Employee first, Employee second) {
//            return (int) (second.getMeasure() - first.getMeasure());
//        }
        public int compare(Employee first, Employee second) {
            return Double.compare(second.getMeasure(),first.getMeasure());
        }

    }

    public static Measurable largest(Measurable[] EmployeesParam) {
        if(EmployeesParam != null) {
            if(EmployeesParam[0] instanceof Employee){

                Arrays.sort((Employee[]) EmployeesParam, new Exercise02().new Employee());
                return EmployeesParam[0];
            }
        }
        return null;
    }

    public static double average(Measurable[] salaries) {
        double sum = 0;
        if(salaries != null) {
            for(int i = 0; i < salaries.length; i++){
                sum = sum + salaries[i].getMeasure();
            }
        }
        return (sum / salaries.length);
    }

    public static void main(String[] args) {
        //Exercise #2
        System.out.println("Exercise #2");
        // How to create an array of objects
        Employee[] Employees = new Employee[3];
        Employees[0] = new Exercise02().new Employee("Mathieu", 2000.0);
        Employees[1] = new Exercise02().new Employee("George",2000.1);
        Employees[2] = new Exercise02().new Employee("Alain",500.0);
        System.out.println(average(Employees));


        System.out.println("Largest salary employee: " + largest(Employees).getName());
    }
}
