package Question_16;


/**
 *
 * Create a lava program that simulates a simple scenario with
 * multiple threads. You can create a program that simulates a
 * race between two or more threads (runners). Each thread should
 * hurve a name and move
 * forward a certain number of steps in a synchronized manner.
 */
public class RaceSimulation {
    public static void main(String[] args) {
        int totalSteps = 4; // Total steps for the race

        // Create runners
        Runner runner1 = new Runner("Runner 1", totalSteps);
        Runner runner2 = new Runner("Runner 2", totalSteps);
        Runner runner3 = new Runner("Runner 3", totalSteps);

        // Create threads for each runner
        Thread thread1 = new Thread(runner1);
        Thread thread2 = new Thread(runner2);
        Thread thread3 = new Thread(runner3);

        // Start the race
        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for all threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println("Race interrupted.");
        }

        System.out.println("Race finished!");
    }
}
