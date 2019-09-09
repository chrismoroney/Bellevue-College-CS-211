/*
Chris Moroney
CS 211 Spring 2018
HW1 Due 15 April 2018
Page 660, Exercises 12-16
Interface Asset for class Cash
*/
package hw1;

// Represents financial assets that investors hold.
public interface Asset {
    // how much the asset is worth
    public double getMarketValue();
    
    // how much money has been made on this asset
    public double getProfit();
}
