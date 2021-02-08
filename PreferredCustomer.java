
package ch.pkg9.pkg8;

public class PreferredCustomer extends Customer
{
    private double purchased; //purchased amount
    private double discountLevel; //curent discount percentage
    public PreferredCustomer() //default constructor
    {
        purchased = 0;
    }
     public PreferredCustomer(int custNum, boolean mailingList) //uses the Person class default constructor and Customer's overloaded
    {
        super(custNum,mailingList);
        purchased = 0;
        discountLevel=0; //set to zero by default so user does not get 100% off
    }
    public PreferredCustomer(String name, String address, String phone, int custNum, boolean mailingList) //Person and Customer overloaded constructors
    {
        super(name,address,phone,custNum,mailingList);
        purchased = 0;
        discountLevel=0; //set to zero by default so user does not get 100% off
    }
     public PreferredCustomer(String name, String address, String phone, int custNum, boolean mailingList, double purchased) //All overloaded constructors
    {
        super(name,address,phone,custNum,mailingList);
        if(purchased > 0)
            this.purchased = purchased;
        else
            this.purchased = 0;
        discountLevel=0; //set to zero by default so user does not get 100% off
    }
     public double getPurchased() //returns purchased amount
     {
         return purchased;
     }
     public void increasePurchased(double amount) //increases purchased amount
     {
         if(amount > 0)
            purchased += amount;
     }
     public void setPurchased(double purchased)//updates purchased amount
     {
         if(purchased > 0)
            this.purchased = purchased;
     }
     public double calcDiscount() //calcdiscount method for percentage and disount savings
     {
         double amount = 0;
         if (purchased >= 2000)
         {
             discountLevel = .10;
             if(purchased >= 2000.01)
                 amount += discountLevel * (purchased - 2000);
         }  
         else if (purchased >= 1500)
         {
             discountLevel = .07;
             if(purchased >= 1500.01)
                 amount += discountLevel * (purchased - 1500);
         }  
         else if (purchased >= 1000)
         {
             discountLevel = .06;
             if(purchased >= 1000.01)
                 amount += discountLevel * (purchased - 1000);
         }  
           else if (purchased > 500)
         {
             discountLevel = .05;
             if(purchased >= 500.01)
                 amount += discountLevel * (purchased - 500);
         }  
         return amount;
     }
     public String toString() //overload of the default toString()
    {
        
      return super.toString() + " Purchases: " + purchased +  " Discount Savings: " + calcDiscount()+ " last discount level: "+ discountLevel + "%";// want the most updated discount amount
    }
}
