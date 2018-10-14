package ch03;

public class Exercise09 {

    static Runnable task1 = new task1();
    static Runnable task2 = new task2();
    static Runnable task3 = new task3();
    static Runnable task4 = new task4();

    public static void main(String[] args) {
        //Exercise #9
        System.out.println("Exercise #9");
        System.out.println("Start runTogether method");
        runTogether(task1, task2);
        System.out.println("Start runInOrder method");
        runInOrder(task3, task4);
    }

    public static void runTogether(Runnable t1, Runnable t2){
        Thread thread2 = new Thread(t2);
        t1.run();
        thread2.start();
    }

    public static void runInOrder(Runnable t1, Runnable t2){
        Thread thread1 = new Thread(t1){
            public void run(){
                t1.run();
                t2.run();
            }
        };
        thread1.start();
    }
}

class task1 implements Runnable{

    public void run() {
        System.out.println("Task1");
    }
}

class task2 implements Runnable{

    public void run() {
        System.out.println("Task2");
    }
}

class task3 implements Runnable{

    public void run() {
        System.out.println("Task3");
    }
}

class task4 implements Runnable{

    public void run() {
        System.out.println("Task4");
    }
}