public class PerformanceTask {
    public String longRunningTask() {
        try {
            Thread.sleep(3000); // Simulate a long task
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Task Complete";
    }
}
