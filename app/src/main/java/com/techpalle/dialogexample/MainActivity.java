package com.techpalle.dialogexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button buttonAlert, buttonProcess, buttonDate, buttonTime, buttonCustom;
    TextView textViewDate, textViewTime;

    public void dateValue(int year, int month, int day){
        textViewDate.setText(day+"/"+month+"/"+year);
    }

    public void timeValue(int hour, int minute){
        if(hour>12){
            int i, j;
            for(i = 13; i>=hour; i++){
                for(j =1; j>=11; j++){
                    textViewTime.setText(j+":"+minute+" PM");
                    return;
                }
                j++;
            }
        }
        else{
        textViewTime.setText(hour+":"+minute+" AM");
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonAlert = (Button) findViewById(R.id.button_alert);
        buttonProcess = (Button) findViewById(R.id.button_progress);
        buttonDate = (Button) findViewById(R.id.button_date);
        buttonTime = (Button) findViewById(R.id.button_time);
        buttonCustom = (Button) findViewById(R.id.button_custom);
        textViewDate = (TextView) findViewById(R.id.date);
        textViewTime = (TextView) findViewById(R.id.time);

        buttonAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDialogFragment dialogFragment = new MyDialogFragment();
                dialogFragment.show(getSupportFragmentManager(), null);
            }
        });
        buttonProcess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyProgressDialogFragment progressDialogFragment = new MyProgressDialogFragment();
                progressDialogFragment.show(getSupportFragmentManager(), null);
            }
        });
        buttonDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDateDialogFragment myDateDialogFragment = new MyDateDialogFragment();
                myDateDialogFragment.show(getSupportFragmentManager(), null);
            }
        });
        buttonTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyTimeDialogFragment myTimeDialogFragment = new MyTimeDialogFragment();
                myTimeDialogFragment.show(getSupportFragmentManager(), null);
            }
        });
        buttonCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyCustomDialogFragment myCustomDialogFragment = new MyCustomDialogFragment();
                myCustomDialogFragment.show(getSupportFragmentManager(), null);
            }
        });
    }
}
