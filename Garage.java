import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Garage {
    private ArrayList<Vehicle> vehicles;

    public Garage(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void tick()
    {
        Timer timer = new Timer();

        for( int i =0;i<vehicles.size();i++)
        {
            int finalI = i;
            TimerTask timerTask = new TimerTask() {
                @Override
                public void run() {
                    vehicles.get(finalI).fixed();
                }
            };
            timer.schedule(timerTask,vehicles.get(i).getFixTime());
        }

    }
}
