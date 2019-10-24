package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewByID(R.id.btn_0).setOnClickListener(this);
    }

    public void onclick()
    {
        switch(op1) {
            case(R.id.btn_0):
                op1 = op1 * 10 + 1;
        }
    }
}
