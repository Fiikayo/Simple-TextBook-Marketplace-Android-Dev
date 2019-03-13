package com.example.danny.bookstore;
//book singleton class
import java.util.ArrayList;

public class Book {
    private static Book single_instance = null;
    private TextBook default1;
    private TextBook default2;
    private TextBook default3;
    private ArrayList <TextBook>  bookList = null;
    private Book()
    {
        default1 = new TextBook("Chronicles of Narnia","$200","A Novel by CS Lewis"); //3 Default books initialized
        default2 = new TextBook("Steve Jobs","$180","Autobiography of Steve Jobs");
        default3 = new TextBook("Percy Jackson","$79.99","Greek Mythology");
        bookList = new ArrayList<TextBook>();
        bookList.add(default1);
        bookList.add(default2);
        bookList.add(default3);
    }

    public static Book getInstance()
    {
        if(single_instance==null)
        {single_instance = new Book();}

        return single_instance;
    }

    //Return bookList
    public ArrayList<TextBook> getBookList() {
        return bookList;
    }
    //Add book to bookList arraylist
    public void addBook(TextBook newBook)
    {
        bookList.add(newBook);
    }
    //Remove Book from bookList
    public boolean removeBook(int index)
    {
        TextBook newBook = bookList.get(index);
        bookList.remove(index);
        return true;
    }



}
