public class Car  extends Vehicle{
    public Car(String name) {
        super(name);
    }

    @Override
    public int getFixTime() {
        return 5;
    }

    @Override
    public void fixed() {
        System.out.println("all four tires fixed");

    }
}
