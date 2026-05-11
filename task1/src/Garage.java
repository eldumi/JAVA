public class Garage
{
    private Vehicle[] fleet;
    private int size;
    private int capacity;

    public Garage(int capacity) {
        this.capacity = capacity;
        this.fleet = new Vehicle[capacity];
        this.size = 0;
    }

    public void add(Vehicle v)
    {
        if(size>=capacity)
        {
            System.out.println("Garage is full\n");
            return;
        }

        if(findByID(v.getId())!=null)
        {
            System.out.println("Vehicle already exists\n");
            return;
        }
        else
        {
            fleet[size]=v;
            size++;
        }
    }

    public Vehicle findByID(String id)
    {
        for (int i = 0; i < size; i++) {
            if (fleet[i].getId().equals(id))
            {
                return fleet[i];
            }
        }
        return null;
    }

    public void rentByID(String id)
    {
        Vehicle v = findByID(id);
        if(v!=null)
        {
            v.rent();
        }
        else {
            System.out.println("Vehicle not found\n");
        }
    }

    public void returnByID  (String id,int drivenKm)
    {
        Vehicle v = findByID(id);
        if(v!=null)
        {
            v.returnVehicle(drivenKm);
        }
        else {
            System.out.println("Vehicle not found\n");
        }
    }

    public void printAvailable()
    {
        for(int i=0;i<size;i++)
        {
            if(fleet[i].isRented()==false)
            {
                System.out.println(fleet[i].brand+" "+fleet[i].getId()+" is available\n");
            }
        }
    }

    public void printNeedsService()
    {
        for(int i=0;i<size;i++)
        {
            if(fleet[i].needsService())
            {
                System.out.println("Vehicle "+fleet[i].getId()+" needs service!\n");
            }
        }
    }

    public void printRentalEstimate(String id,int days)
    {
        Vehicle v = findByID(id);
        if(v!=null)
        {
            System.out.println("Rental price for "+v.getId()+" is "+v.rentalPrice(days));
        }
        else {
            System.out.println("Vehicle not found\n");
        }
    }

}
