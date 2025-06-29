import java.util.concurrent.TimeUnit;

public class Performance {
    public void task() {
        try{
            TimeUnit.SECONDS.sleep(2);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
