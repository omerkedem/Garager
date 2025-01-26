import java.util.ArrayList;

public class DB {
    private ArrayList<Vehicle> vehicles;

    public ArrayList<Vehicle> getVehicles()
    {
        return this.vehicles;
    }
    public DB(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
    public DB()
    {
        vehicles = new ArrayList<>();
    }

    public void Add(Vehicle v)
    {
        this.vehicles.add(v);
    }
}
