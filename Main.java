import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main implements ProtocolGararge{

    public static void main(String[] args) {
        DB db = new DB();
        Scanner scanner = new Scanner(System.in);
        String name;
        int choice =1;
        while(choice != 0)
        {
            System.out.println("to enter a car press 1, to enter a motorcycle press 2, to enter a truck press 3, press 0 to stop");
            choice = scanner.nextInt();
            if(choice == 1)
            {
                System.out.println("enter car name");
                name = scanner.nextLine();
                db.Add(new Car(name));

            }
            else if(choice == 2)
            {
                System.out.println("enter motorcycle name");
                name = scanner.nextLine();
                db.Add(new Motorcycle(name));

            }
            else if(choice == 3)
            {
                System.out.println("enter truck name");
                name = scanner.nextLine();
                db.Add(new Truck(name));

            }

        }
        Garage garage = new Garage(db.getVehicles());
        garage.tick();
    }

    @Override
    public void fixed() {

    }
}