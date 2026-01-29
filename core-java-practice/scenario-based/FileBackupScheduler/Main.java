
public class Main {
    public static void main(String[] args) {
        BackupScheduler scheduler = new BackupScheduler();

        try {
            scheduler.addTask(new BackupTask("/system/config", 5));
            scheduler.addTask(new BackupTask("/user/photos", 3));
            scheduler.addTask(new BackupTask("/temp", 1));
            scheduler.addTask(new BackupTask("", 4));
        } catch (InvalidBackupPathException e) {
            System.out.println(e.getMessage());
        }

        scheduler.executeTasks();
    }
}
