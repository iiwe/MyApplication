package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2;
    EditText txt1;
    TextView txt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        txt1 = findViewById(R.id.text_1);
        txt2 = findViewById(R.id.text_2);
    }

    public void big(View view) {
        String n = String.valueOf(txt1.getText());
        txt2.setText(n.toUpperCase(Locale.ROOT));
    }

    public void small(View view) {
        String n = String.valueOf(txt1.getText());
        txt2.setText(n.toLowerCase(Locale.ROOT));
    }
}