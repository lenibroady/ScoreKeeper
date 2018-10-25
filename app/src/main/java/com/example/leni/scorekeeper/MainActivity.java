package com.example.leni.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int totalpoints1=0;
int totalpoints2=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addthreepoints1(View view){
        totalpoints1+=3;
        display1();
    }
    public void addthreepoints2(View view){
        totalpoints2+=3;
        display2();
    }
    public void addtwopoints1(View view){
        totalpoints1+=2;
        display1();
    }
    public void addtwopoints2(View view){
        totalpoints2+=2;
        display2();
    }
    public void addonepoint1(View view){
        totalpoints1+=1;
        display1();
    }
    public void addonepoint2(View view){
        totalpoints2+=1;
        display2();
    }
    public void reset(View view){
        totalpoints1=0;
        totalpoints2=0;
        display2();
        display1();
    }
    private void display1() {
        TextView quantityTextView = (TextView) findViewById(R.id.pointsteam1);
        quantityTextView.setText("" + totalpoints1);
    }
    private void display2() {
        TextView quantityTextView = (TextView) findViewById(R.id.pointsteam2);
        quantityTextView.setText("" + totalpoints2);
    }


}
