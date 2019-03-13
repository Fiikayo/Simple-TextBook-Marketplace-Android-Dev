package com.example.danny.bookstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
// Presents user with two option to either Buy or Sell a book
    public void sellB(View view)
    {//Starts sellBookActivity Class if user picks this option
        Intent sellbookintent = new Intent(this,SellBookActivity.class);
        startActivity(sellbookintent);
    }

    public void buyB(View view)
    {//Starts BuyBookActivity Class if user picks this option
        Intent buybookintent = new Intent(this,BuyBookActivity.class);
        startActivity(buybookintent);
    }


}
