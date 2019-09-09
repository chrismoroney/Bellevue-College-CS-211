/*
Chris Moroney
CS 211 Spring 2018
HW1 Due 15 April 2018
Page 660, Exercises 12-16
Cash class for Exercise 13, write an equals method to indicate whether two cash
amounts are equal to eachother or not.
*/
package hw1;

// Represents an amount of money held by an investor.
public class Cash implements Asset {
    private double amount;   // amount of money held
    
    // Constructs a cash investment of the given amount.
    public Cash(double amount) {
        this.amount = amount;
    }
    
    // Returns this cash investment's market value, which
    // is equal to the amount of cash.
    public double getMarketValue() {
        return amount;
    }
    
    // Since cash is a fixed asset, it never has any profit.
    public double getProfit() {
        return 0.0;
    }
    
    // Sets the amount of cash invested to the given value.
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    // [jwl]Adds to the cash amount invested in this asset.
    public void deposit(double amount) {
        this.amount += amount;
    }
    
    // [jwl]Distributes some of the cash in this asset.
    public double distribute(double amount) {
        if (amount <= this.amount) {
            this.amount -= amount;
            return amount;
        }
        return 0.0;
    }
    
    // [jwl]Returns the name of the asset.
    public String toString(){
       return "Cash $" + this.amount;
    }
    // Exercise 13, returns equal if two cash amounts are equal
    public String equal(Cash b){
        if (amount == b.amount){
            return "Equal";
        } else {
            return "Not Equal";
        }
    } 
}
