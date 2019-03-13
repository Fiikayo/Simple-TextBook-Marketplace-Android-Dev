package com.example.danny.bookstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class SellBookActivity extends AppCompatActivity {

    private Book b;                                 //global variables delcared
    private String name;
    private String price;
    private String descript;
   private TextBook currentBook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_book);

    }
    public void sellButton(View view)
    {
        b= Book.getInstance();

        EditText bN = (EditText)findViewById(R.id.bookName);            //gets name of the book user inputs and stores it in a variable called name
        name = bN.getText().toString();

        EditText bP = (EditText)findViewById(R.id.bookPrice);           //gets price of the book user inputs and stores it in a variable called price
        price = bP.getText().toString();

        EditText bD = (EditText)findViewById(R.id.bookDescript);     //gets description of the book user inputs and stores it in a variable called descript
        descript = bD.getText().toString();

        currentBook = new TextBook(name,price,descript); //a New currentBook object is being created
        b.addBook(currentBook);                 //the singleton class adds it into the arraylist
        Toast.makeText(getApplicationContext(),"Thank you for the information. Book has been Sold, return to Main Screen",Toast.LENGTH_LONG).show(); //Toast to confirm that book has been sold
    }
}
