import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MultiTable {
    private final Set<Task> tasks = new HashSet<>();

    public MultiTable() {
        Random random =new Random();

        while (tasks.size() < 15) {
            int val = random.nextInt(10);
            int val2 = random.nextInt(10);
            if(val<2) val+=2;
            if (val2<2) val2+=2;
            tasks.add(new Task(val  ,val2));
        }
    }
        public void printTasks(){
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    @Override
    public String toString() {
        return "tasks" + tasks;
    }
}
