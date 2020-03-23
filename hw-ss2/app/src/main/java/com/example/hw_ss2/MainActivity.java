package com.example.hw_ss2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String input = "0";
    String output = "";
    String current = "";
    TextView tvInput, tvOutput;

    ArrayList<Integer> listId;
    float val;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listId = new ArrayList<>();
        for (int id : listId) {
            findViewById(id).setOnClickListener(this);
        }
        tvInput = findViewById(R.id.tv_input);
        tvOutput = findViewById(R.id.tv_output);
        val = 0;

    }

    @Override
    public void onClick(View v) {
        addCh(listId.indexOf(v.getId()));
        tvInput.setText(input);
    }

    private void addCh(int i) {
        if (i > -1 && i < 11) {
            try {
                current += i;
                val = Float.valueOf(current);
                tvInput.setText(current);
            } catch (Exception e) {
                err();
            }
        }
    }

    private void err() {
        Toast.makeText(this, "Đừng có bấm linh tinh!", Toast.LENGTH_SHORT).show();
    }

    private void calculate() {
        System.out.println(input);
    }


    int pure_listId[] = {
            R.id.ll_0,
            R.id.ll_1,
            R.id.ll_2,
            R.id.ll_3,
            R.id.ll_4,
            R.id.ll_5,
            R.id.ll_6,
            R.id.ll_7,
            R.id.ll_8,
            R.id.ll_9,
            R.id.ll_dot,
            R.id.ll_add,
            R.id.ll_sub,
            R.id.ll_mul,
            R.id.ll_div,
            R.id.ll_mod,
            R.id.ll_del,
            R.id.ll_equ
    };

    final int NONE = -1;
    final int DOT = 10;
    final int ADD = 11;
    final int SUB = 12;
    final int MUL = 13;
    final int DIV = 14;
    final int MOD = 15;
    final int DEL = 16;
    final int EQU = 17;


}
