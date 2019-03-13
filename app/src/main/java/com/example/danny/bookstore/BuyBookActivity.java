package com.example.danny.bookstore;

import android.app.Activity;
import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextClock;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class BuyBookActivity extends Activity {
    private ListView bookListView;  //global methods declared here
    private ArrayList <TextBook> booklist;
    private ArrayAdapter listAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_book);
        Book b = Book.getInstance();
        booklist = b.getBookList();
        bookListView = (ListView)findViewById(R.id.booklist);
        listAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,booklist);
        bookListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {  //Method to delete a book after the user presses and holds the book of choice
             @Override
             public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                 booklist.remove(position);
                 listAdapter.notifyDataSetChanged();
                 Toast.makeText(getApplicationContext(),"Book has been bought",Toast.LENGTH_LONG).show();
                 return false;
             }
         });

        bookListView.setAdapter(listAdapter);
    }
}
