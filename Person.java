package ch.pkg9.pkg8;



public class Person 
{
    private String name; //holds the name
    private String address; //holds the address
    private String phone; //holds the phone number
    
    public Person()//default values
    {
        name = "";
        address = "";
        phone = "";
    }
    public Person(String name, String address, String phone)//overloaded
    {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    public String getName() //returns name
    {
        return name;
    }
    public void setName(String name) //updates the name
    {
        this.name = name;
    }
    public String getAddress()//returns address
    {
        return address;
    }
    public void setAddress(String address)//updates the address
    {
        this.address = address;
    }
    public String getPhone()//return phone number
    {
        return phone;
    }
    public void setPhone(String phone)//updates the phone number
    {
        this.phone = phone;
    }
    @Override
    public String toString() //overload of the default toString()
    {
      return "Name: " + name + " Address: " + address + " Phone: " + phone + " ";
    }
}
