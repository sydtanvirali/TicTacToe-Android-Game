package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int flag=0, count=0;
    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btnReset;
    TextView txtResult;
    String strB1, strB2, strB3, strB4, strB5, strB6, strB7, strB8, strB9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btnReset.setVisibility(View.GONE);
    }
    private void init() {
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btnReset = findViewById(R.id.btnReset);
        txtResult = findViewById(R.id.txtResult);
    }
    @SuppressLint("SetTextI18n")
    public void check_logic(View v) {
        Button btnCurrent = (Button) v;

        if (btnCurrent.getText().toString().equals("")) {
            count++;
            if (flag == 0) {
                btnCurrent.setText("X");
                flag = 1;
            } else {
                btnCurrent.setText("O");
                flag = 0;
            }
            if (count > 4) {
                strB1 = btn_1.getText().toString();
                strB2 = btn_2.getText().toString();
                strB3 = btn_3.getText().toString();
                strB4 = btn_4.getText().toString();
                strB5 = btn_5.getText().toString();
                strB6 = btn_6.getText().toString();
                strB7 = btn_7.getText().toString();
                strB8 = btn_8.getText().toString();
                strB9 = btn_9.getText().toString();

                if (strB1.equals(strB2) && strB2.equals(strB3) && !strB1.equals("")) {
                    txtResult.setText(String.format("%s is Winner", strB1));
                    btnReset.setVisibility(View.VISIBLE);
                } else if (strB4.equals(strB5) && strB5.equals(strB6) && !strB4.equals("")) {
                    txtResult.setText(String.format("%s is Winner", strB4));
                    btnReset.setVisibility(View.VISIBLE);
                } else if (strB7.equals(strB8) && strB8.equals(strB9) && !strB7.equals("")) {
                    txtResult.setText(String.format("%s is Winner", strB7));
                    btnReset.setVisibility(View.VISIBLE);
                } else if (strB1.equals(strB5) && strB5.equals(strB9) && !strB1.equals("")) {
                    txtResult.setText(String.format("%s is Winner", strB1));
                    btnReset.setVisibility(View.VISIBLE);
                } else if (strB3.equals(strB5) && strB5.equals(strB7) && !strB3.equals("")) {
                    txtResult.setText(String.format("%s is Winner", strB3));
                    btnReset.setVisibility(View.VISIBLE);
                } else if (strB1.equals(strB4) && strB4.equals(strB7) && !strB1.equals("")) {
                    txtResult.setText(String.format("%s is Winner", strB1));
                    btnReset.setVisibility(View.VISIBLE);
                } else if (strB2.equals(strB5) && strB5.equals(strB8) && !strB2.equals("")) {
                    txtResult.setText(String.format("%s is Winner", strB2));
                    btnReset.setVisibility(View.VISIBLE);
                } else if (strB3.equals(strB6) && strB6.equals(strB9) && !strB3.equals("")) {
                    txtResult.setText(String.format("%s is Winner", strB3));
                    btnReset.setVisibility(View.VISIBLE);
                } else if (count == 9) {
                    txtResult.setText("Ties");
                    btnReset.setVisibility(View.VISIBLE);
                }
            }
        }
    }
    @SuppressLint("SetTextI18n")
    public void reset(View v) {
        btn_1.setText("");
        btn_2.setText("");
        btn_3.setText("");
        btn_4.setText("");
        btn_5.setText("");
        btn_6.setText("");
        btn_7.setText("");
        btn_8.setText("");
        btn_9.setText("");
        txtResult.setText("Result");
        count = 0;
        flag = 0;
        btnReset.setVisibility(View.GONE);
    }
}
