package ch03;

public class Exercise08 {

    public static void main(String[] args) {
        //Exercise #8
        System.out.println("Exercise #8");

        Runnable task1 = new Greeter(6,"toi");
        Runnable task2 = new Greeter(4,"moi");

        Thread thread2 = new Thread(task2);
        task1.run();
        thread2.start();
    }
}

class Greeter implements Runnable{
    private int n;
    private String target;

    Greeter(int n, String target){
        this.n = n;
        this.target = target;
    }

    public void run() {
        for(int i=0; i < n; i++){
            System.out.println("Hello, "+target);
        }
    }
}
