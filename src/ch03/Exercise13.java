package ch03;

public class Exercise13 {

    // Method that create a Runnable object with Run executes them in order
    // Return a lambda expression
    public static Runnable runOrder (Runnable[] runTask){
        return () -> {
            for(Runnable item : runTask){
                item.run();
            }

        };
    }

    public static void main(String[] args) {
        //Exercise #13
        System.out.println("Exercise #13");

        // Create an array of Runnable instances
        Runnable task1 = () -> System.out.println("Print #1");
        Runnable task2 = () -> System.out.println("Print #2");
        Runnable runnableArray[] = {task1, task2};

        // Call a method that return a runnable object
        Runnable taskOrdered = runOrder(runnableArray);

        // Execute the threads
        taskOrdered.run();

    }
}
