package com.codingurbrain.gradientbuttonstyleandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button mButton1,mButton2,mButton3,mButton4,mButton5;
    private TextView mTextview1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        buttonClicks();

    }
    private void findViews(){
        mButton1 = findViewById(R.id.button_1);
        mButton2 = findViewById(R.id.button_2);
        mButton3 = findViewById(R.id.button_3);
        mButton4 = findViewById(R.id.button_4);
        mButton5 = findViewById(R.id.button_5
        );
        mTextview1 = (TextView) findViewById(R.id.textview1);
    }

    private void buttonClicks(){
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt1 = "Button1 Clicked";
                mTextview1.setText(""+txt1);

            }
        });
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt2 = "Button2 Clicked";
                mTextview1.setText(""+txt2);

            }
        });
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt3 = "Button3 Clicked";
                mTextview1.setText(""+txt3);

            }
        });
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt4 = "Button4 Clicked";
                mTextview1.setText(""+txt4);

            }
        });
        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt5 = "Button5 Clicked";
                mTextview1.setText(""+txt5);
            }
        });
    }

}