public class Car extends Vehicle
{
    private int doors;

    public Car(String brand, double speed, String id, int mileage, boolean rented, int doors) {
        super(brand, speed, id, mileage, rented);
        this.doors = doors;
    }

    @Override
    public void move() {
        System.out.println("Car moved");
    }

    @Override
    public boolean needsService() {

        return getMileage() >= 10000;
    }

    @Override
    public double rentalPrice(int days) {
        double price = days * 50.0;
        if(doors>=4)
        {
            price*=1.10;
        }
        return price;
    }
}

