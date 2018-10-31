package ch04;

public class test_super_method {
    public static void main(String[] args) {
        Worker task = new ConcurrentWorker();

        task.work();
    }
}

class Worker {
    public void work(){
        for (int i = 0; i < 100; i++) System.out.println("Working");
    }
}

class ConcurrentWorker extends Worker {
    public void work() {
        Thread t = new Thread(super::work);
        t.start();
    }
}
