
import java.util.PriorityQueue;

public class BackupScheduler {
    private PriorityQueue<BackupTask> queue = new PriorityQueue<>();

    public void addTask(BackupTask task) throws InvalidBackupPathException {
        if (task.getFolderPath() == null || task.getFolderPath().isEmpty()) {
            throw new InvalidBackupPathException("Invalid backup path!");
        }
        queue.offer(task);
        System.out.println("Task added: " + task);
    }

    public void executeTasks() {
        System.out.println("Executing backup tasks by priority:");
        while (!queue.isEmpty()) {
            BackupTask task = queue.poll();
            System.out.println("Backing up folder: " + task.getFolderPath());
        }
    }
}
