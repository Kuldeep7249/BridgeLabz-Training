package FunctionalInterface.BackgroundJob;

public class BackgroundJob {
    public static void main(String[] args) {

        // Runnable task using lambda
        Runnable job = () -> {
            System.out.println("Background job is running...");
        };
        // Execute task asynchronously
        Thread thread = new Thread(job);
        thread.start();
        
        System.out.println("Main thread continues...");
    }
}
