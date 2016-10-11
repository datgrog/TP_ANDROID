package fr.esiea.mobile.tp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    private static ArrayList<String> books = new ArrayList<>();
    private static ArrayAdapter myArrayAdapter;
    private static EditText bookTitle;
    private ListView booksList;
    private Button addBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        this.booksList = (ListView) findViewById(R.id.list_book);
        this.bookTitle = (EditText) findViewById(R.id.book_title);
        this.addBook = (Button) findViewById(R.id.add_book);

        myArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, books);
        this.booksList.setAdapter(myArrayAdapter);

        addBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hideSoftKeyboard(DetailActivity.this, v); // MainActivity is the name of the class and v is the View parameter used in the button listener method onClick.
                books.add(bookTitle.getText().toString());
                myArrayAdapter.notifyDataSetChanged();
                bookTitle.getText().clear();
            }
        });
    }

    public static void hideSoftKeyboard (Activity activity, View view)
    {
        InputMethodManager imm = (InputMethodManager)activity.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }
}
