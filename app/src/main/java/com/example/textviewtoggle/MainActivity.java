package com.example.textviewtoggle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button button;
    TextView textView;
    int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.buttonToggle);
        textView = findViewById(R.id.text_toggle);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (i == 1) {
                    i = 0;
                    textView.setVisibility(View.INVISIBLE);
                } else {
                    i = 1;
                    textView.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}

