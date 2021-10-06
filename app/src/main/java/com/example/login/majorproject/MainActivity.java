package com.example.login.majorproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
    }

    public void cse(View view) {
        Intent i = new Intent(getApplicationContext(), Main2Activity.class);
        i.putExtra("project", "answer");
        startActivity(i);
    }

    public void eee(View view) {
        Intent i = new Intent(getApplicationContext(), Main2Activity.class);
        i.putExtra("project", "answer");
        startActivity(i);
    }

    public void it(View view) {
        Intent i = new Intent(getApplicationContext(), Main2Activity.class);
        i.putExtra("project", "answer");
        startActivity(i);
    }

    public void ece(View view) {
        Intent i = new Intent(getApplicationContext(), Main2Activity.class);
        i.putExtra("project", "answer");
        startActivity(i);
    }
    
    public void mec(View view) {
        Intent i = new Intent(getApplicationContext(), Main2Activity.class);
        i.putExtra("project", "answer");
        startActivity(i);
    }

}
