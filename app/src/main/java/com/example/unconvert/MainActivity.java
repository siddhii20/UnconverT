package com.example.unconvert;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button button;
        TextView textView;
        EditText editText;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView3);
        editText=findViewById(R.id.editTextNumberDecimal2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=editText.getText().toString();
                int kg=Integer.parseInt(s);
                double pound=2.205*kg;
                textView.setText("The corresponding value in pounds:"+pound);
            }
        });
    }
}