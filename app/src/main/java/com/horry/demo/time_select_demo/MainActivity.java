package com.horry.demo.time_select_demo;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private TextView time_text;
    private int year;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        year = calendar.get(Calendar.YEAR);
        time_text = (TextView)findViewById(R.id.time_text);
        time_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TimeSelectActivity.class);
                startActivityForResult(intent,1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==RESULT_OK)
        {
            if(requestCode==1){
                String date = year + "-" + data.getStringExtra("date").replace("/","-");
                String time = data.getStringExtra("time");
                time_text.setText(date+" "+time);
                time_text.setTextColor(Color.BLACK);
            }
        }
    }
}
