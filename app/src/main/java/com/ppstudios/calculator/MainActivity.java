package com.ppstudios.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.logo)
    ImageView logo;
    @BindView(R.id.firstNumber)
    EditText firstNumber;
    @BindView(R.id.secondNumber)
    EditText secondNumber;
    @BindView(R.id.answer)
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btnAdd, R.id.btnSubtract, R.id.btnMultiply, R.id.btnDivide})
    public void onViewClicked(View view) {
        int num1 = Integer.parseInt(firstNumber.getText().toString());
        int num2 = Integer.parseInt(secondNumber.getText().toString());

        switch (view.getId()) {
            case R.id.btnAdd:
                answer.setText("Answer is: " + (num1 + num2));
                break;
            case R.id.btnSubtract:
                answer.setText("Answer is: " + (num1 - num2));
                break;
            case R.id.btnMultiply:
                answer.setText("Answer is: " + (num1 * num2));
                break;
            case R.id.btnDivide:
                answer.setText("Answer is: " + (num1 / num2));
                break;
        }
    }

    @OnClick(R.id.btnClear)
    public void onViewClicked() {
        answer.setText("");
        firstNumber.setText("");
        secondNumber.setText("");
    }
}
