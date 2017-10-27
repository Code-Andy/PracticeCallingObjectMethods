package com.example.doudo.practicecallingobjectmethods;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        textView.setText("wow");
        setContentView(textView);

        // Capture the layout's TextView and set the string as its text

    }
}
