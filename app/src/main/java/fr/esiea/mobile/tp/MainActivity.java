package fr.esiea.mobile.tp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static fr.esiea.mobile.tp.R.layout.activity_main;

/**
 * Activity with words at center
 */
public class MainActivity extends AppCompatActivity {

    private TextView myTextView;
    private EditText myEditText;
    private Button myButton;
    private Button myButton1;
    public  static Snackbar mySnackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);

        /* Request focus*/
        findViewById(R.id.activity_main).requestFocus();

        /* Link xml resources to var */
        this.myTextView = (TextView) findViewById(R.id.textView);
        this.myEditText = (EditText) findViewById(R.id.editText);
        this.myButton = (Button) findViewById(R.id.button);
        this.myButton1 = (Button) findViewById(R.id.button1);

        this.myTextView.setText("DAT TITLE EW!");

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mySnackbar = Snackbar.make(findViewById(R.id.activity_main), "MUCH WOW ", Snackbar.LENGTH_SHORT);
                mySnackbar.show();
                Log.i("Button CLICK", "Detected");
            }
        });

        myButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Grill Toast : " + myEditText.getText().toString(), Toast.LENGTH_LONG).show();
                Intent nextActivity = new Intent(getApplicationContext(), DetailActivity.class);
                startActivity(nextActivity);
            }
        });

    }
}
