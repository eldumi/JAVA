public abstract class Vehicle
{
    String brand;
    double speed;

    private String id;
    private int mileage;
    private boolean rented;

    public Vehicle(String brand, double speed, String id, int mileage, boolean rented) {
        this.brand = brand;
        this.speed = speed;
        this.id = id;
        this.mileage = mileage;
        this.rented = rented;
    }

    public void rent()
    {
        if (rented==true)
        {
            System.out.println("This vehicle is already rented");
        }
        else
        {
            rented=true;
            System.out.println("Vehicle rented");
        }
    }

    public void returnVehicle(int drivenKm)
    {
        if(rented==false)
        {
            System.out.println("This vehicle is not rented");
        }
        else
        {
            if(drivenKm>0)
            {
                rented = false;
                mileage += drivenKm;
                System.out.println("Vehicle returned");
            }
        }
    }

    public abstract boolean needsService();
    public abstract double rentalPrice(int days);

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Vehicle)
        {
            Vehicle vehicle = (Vehicle) obj;
            return this.brand.equals(vehicle.brand) && this.speed == vehicle.speed;
        }
        return false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                ", id='" + id + '\'' +
                ", mileage=" + mileage +
                ", rented=" + rented +
                '}';
    }

    public abstract void move();
}
