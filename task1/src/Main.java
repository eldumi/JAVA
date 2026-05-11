//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
//        Vehicle[] vehicles = new Vehicle[3];
//
//        Car masina = new Car("Masina", 1200);
//        Motorcycle motorcycle = new Motorcycle("Kawasaki",300);
//        Truck truck = new Truck("Scandia",180);
//
//        vehicles[0] = masina;
//        vehicles[1] = motorcycle;
//        vehicles[2] = truck;
//
//        for(Vehicle vehicle : vehicles)
//        {
//            vehicle.move();
//        }
//
//        if( vehicles[0].equals(vehicles[1]))
//
//            System.out.println("Egale");
//
//            else
//                System.out.println("Inegale");

        Garage garaj = new Garage(10);

        garaj.add(new Car("Toyota", 180.0, "CAR-01", 12000, false, 4));
        garaj.add(new Car("Mini Cooper", 160.0, "CAR-02", 5000, false, 2));
        garaj.add(new Motorcycle("Honda", 220.0, "MOTO-01", 7000, false, false));
        garaj.add(new Motorcycle("BMW Motorrad", 200.0, "MOTO-02", 3000, false, true));
        garaj.add(new Truck("Volvo FH", 90.0, "TRUCK-01", 16000, false, 20000.0));

        garaj.rentByID("CAR-01\n");
        garaj.rentByID("MOTO-01\n");
        garaj.rentByID("CAR-03\n");

        garaj.printAvailable();
        garaj.printNeedsService();
        garaj.printRentalEstimate("CAR-01\n", 2);

    }
}