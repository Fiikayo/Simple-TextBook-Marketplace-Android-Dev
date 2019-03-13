package com.example.danny.bookstore;
//Custom Texbook class that models a real book
public class TextBook {

    private String bName;
    private String bPrice;
    private String bDescription;
    public TextBook(String bName, String bPrice, String bDescription) //Constructor
    {
        this.bName = bName;
        this.bPrice = bPrice;
        this.bDescription = bDescription;
    }

    public String getbName()
    {
        return bName;
    }

    public String getbPrice()
    {
        return bPrice;
    }

    public String getbDescription()
    {
        return bDescription;
    }

    public String toString() //toString method to return the name, price and description of a book
    {
        String bDetails = bName+" "+bPrice+" "+bDescription;
        return bDetails;}
}
