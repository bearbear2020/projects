
public class CargoShip extends Ship
{
    private int tonnage;
    
     public CargoShip()
    {
       tonnage =0;
    }
    public CargoShip(int tonnage)
    {
        this.tonnage = tonnage;
    }
    public CargoShip(String name, String yearBuilt)
    {
        super(name,yearBuilt);
    }
    public CargoShip(String name, String yearBuilt, int tonnage)
    {
        super(name, yearBuilt);
        this.tonnage = tonnage;
    }
    public int getTonnage()
    {
        return tonnage;
    }
    public void setTonnage(int tonnage)
    {
        this.tonnage = tonnage;
    }
    @Override
    public String toString()
    {
        return "Ship Name: " + getName() + " Tonnage: " + tonnage;
    }
}
