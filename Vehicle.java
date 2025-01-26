public abstract class Vehicle implements Fixable {

    private String name;

    public abstract int getFixTime();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }
    public Vehicle(String name)
    {
        setName(name);
    }
}
