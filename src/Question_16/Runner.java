package Question_16;

public class Runner implements Runnable {
    private String name;
    private int totalSteps;
    private int currentPosition;

    public Runner(String name, int totalSteps) {
        this.name = name;
        this.totalSteps = totalSteps;
        this.currentPosition = 0;
    }

    @Override
    public void run() {
        while (currentPosition < totalSteps) {
            synchronized (Runner.class) {
                currentPosition++;
                System.out.println(name + " moved to position: " + currentPosition);
                try {
                    Thread.sleep(100); // Simulate time taken for each step
                } catch (InterruptedException e) {
                    System.out.println(name + " was interrupted.");
                }
            }
        }
        System.out.println(name + " finished the race!");
    }
}
