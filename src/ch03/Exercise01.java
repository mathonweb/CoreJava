package ch03;

public class Exercise01 {

    public interface Measurable{
        double getMeasure();
    }

    public class Employee implements Measurable {
        double object;

        Employee(double val){
            object = val;
        }

        public double getMeasure() {
            return object;
        }
    }

    public static double average(Measurable[] objects) {
        double sum = 0;
        if(objects != null) {
            for(int i = 0; i < objects.length; i++){
                sum = sum + objects[i].getMeasure();
            }
        }
        return (sum / objects.length);
    }

    public static void main(String[] args) {
        //Exercise #1
        System.out.println("Exercise #1");
        // How to create an array of objects
        Measurable[] Employees = new Employee[2];
        Employees[0] = new Exercise01().new Employee(1.0);
        Employees[1] = new Exercise01().new Employee(2.0);

        System.out.println(average(Employees));
    }
}
