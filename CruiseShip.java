
public class CruiseShip extends Ship
{
    private int passengers;
    
    public CruiseShip()
    {
        passengers =0;
    }
    public CruiseShip(int passengers)
    {
        this.passengers = passengers;
    }
    public CruiseShip(String name, String yearBuilt)
    {
        super(name,yearBuilt);
    }
    public CruiseShip(String name, String yearBuilt, int passengers)
    {
        super(name, yearBuilt);
        this.passengers = passengers;
    }
     public int getPassengers()
    {
        return passengers;
    }
    public void setPassengers(int passengers)
    {
        this.passengers = passengers;
    }
    @Override
    public String toString()
    {
        return "Ship Name: " + getName() + " Passengers: " + passengers;
    }
}
