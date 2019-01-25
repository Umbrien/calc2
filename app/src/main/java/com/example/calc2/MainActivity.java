package com.example.calc2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView sum;
    private EditText t1;
    private EditText t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sum = findViewById(R.id.sumTextView);
        t1 = findViewById(R.id.firstInput);
        t2 = findViewById(R.id.secondInput);
    }

    public void calculate(android.view.View view) {
        String t1Txt = t1.getText().toString();
        String t2Txt = t2.getText().toString();

        if (t1Txt.equals("") || t2Txt.equals("")) {
            sum.setText("Два заполни инпута");
        } else {
            switch (view.getId()) {
                case R.id.sumBtn:
                    sum.setText(Double.parseDouble(t1Txt) + Double.parseDouble(t2Txt) + "");
                    break;
                case R.id.minusBtn:
                    sum.setText(Double.parseDouble(t1Txt) - Double.parseDouble(t2Txt) + "");
                    break;
                case R.id.multiplyBtn:
                    sum.setText(Double.parseDouble(t1Txt) * Double.parseDouble(t2Txt) + "");
                    break;
                case R.id.divideBtn:
                    sum.setText(Double.parseDouble(t1Txt) / Double.parseDouble(t2Txt) + "");
                }
            }
        }
    }
