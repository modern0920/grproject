package com.example.ibyg;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class ListingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listing);




        TextView text = (TextView)findViewById(R.id.textView9);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.textView9:
                        myStartActivity(SetLocActivity.class);
                        break;
                }


            }
        });

        Button button = (Button)findViewById(R.id.findcafeButton);
        Button button2 = (Button)findViewById(R.id.ahpButton);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.findcafeButton:
                        myStartActivity(FindCafeActivity.class);
                        break;

                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(view.getId()){
                    case R.id.ahpButton:
                        myStartActivity(AhpActivity.class);
                        break;
                }
            }
        });
    }


    private void myStartActivity (Class c){
            Intent intent = new Intent(this, c);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        }




    }




