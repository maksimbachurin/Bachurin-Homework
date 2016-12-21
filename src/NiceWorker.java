/**
 * Created by Максим on 22.12.2016.
 */
public class NiceWorker extends Worker {
    private boolean flag;

    public NiceWorker(String name, int salary, boolean flag) {
        super(name, salary);
        this.flag = flag;
    }
}