/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.pkg9.pkg8;

/**
 *
 * @author trgie
 */
public class Customer extends Person 
{
    private int custNum; //holds customer number
    private boolean mailingList; //if wanting to be on the mailing list
    
    public Customer()//default constructor
    {
        custNum = -1;
        mailingList = false;
    }
     public Customer(int custNum, boolean mailingList) //uses the Person class default constructor
    {
        this.custNum = custNum;
        this.mailingList = mailingList;
    }
    public Customer(String name, String address, String phone, int custNum, boolean mailingList) //both overloaded constructors
    {
        super(name,address,phone);
        this.custNum = custNum;
        this.mailingList = mailingList;
    }
    public int getCustNum() //returns the customer number
    {
        return custNum;
    }
    public void setCustNum(int custNum) //updates the customer number
    {
        this.custNum = custNum;
    }
    public boolean getMailingList() //returns mailinglist value
    {
        return mailingList;
    }
    public void setMailingList(boolean mailingList) //updates the mailinglist value
    {
        this.mailingList = mailingList;
    }
     @Override
    public String toString() //overload of the default toString()
    {
        String temp = ""; //used to return a yes or no over a true or false for easier understanding
        if(mailingList)
            temp = "Yes";
        else
            temp = "No";
      return super.toString() + "Customer Number: " + custNum + " Mailing List: " + temp;
    }
    
}
