package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText E1;
    TextView V1;
    String S;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1= (Button) findViewById(R.id.button1);
        E1= (EditText) findViewById(R.id.Name1);
        V1= (TextView) findViewById(R.id.textView1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String S = E1.getText().toString();
                V1.setText("Hello , "+S);
            }

        });
    }
}
