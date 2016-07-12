package com.example.android.myonclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void button1 (View v){
        Toast.makeText(this,"This button will launch my BUILD IT BIGGER app!", Toast.LENGTH_LONG).show();
    }
    public void button2(View v){
        Toast.makeText(this,"This button will launch my STOCK HAWK app!", Toast.LENGTH_LONG).show();
    }
    public void button3(View v){
        Toast.makeText(this,"This button will launch my POULAR MOVIES app!", Toast.LENGTH_LONG).show();
    }
    public void button4(View v){
        Toast.makeText(this,"This button will launch my MAKE YOUR APP MATERIAL app!", Toast.LENGTH_LONG).show();
    }
    public void button5(View v){
        Toast.makeText(this,"This button will launch my GO UBIQITOUS app!", Toast.LENGTH_LONG).show();
    }
    public void button6(View v){
        Toast.makeText(this,"This button will launch my CAPSTONE app!", Toast.LENGTH_LONG).show();
    }
}
