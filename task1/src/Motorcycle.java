public class Motorcycle extends Vehicle
{
    private boolean hasSidecar;

    public Motorcycle(String brand, double speed, String id, int mileage, boolean rented, boolean hasSidecar) {
        super(brand, speed, id, mileage, rented);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void move() {
        System.out.println("Motorcycle moved");
    }

    @Override
    public boolean needsService() {

        return getMileage() >= 6000;
    }

    @Override
    public double rentalPrice(int days) {
        double price = days * 30.0;
        if(hasSidecar)
        {
            price+=15*days;
        }
        return price;
    }
}

