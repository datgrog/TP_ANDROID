package fr.esiea.mobile.tp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.myTextView = (TextView) findViewById(R.id.textView);
        this.myTextView.setText("Start from scratch after a while");
    }
}
