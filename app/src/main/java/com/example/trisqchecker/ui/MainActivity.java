package com.example.trisqchecker.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.trisqchecker.R;
import com.example.trisqchecker.logic.sq;
import com.example.trisqchecker.logic.tri;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private EditText num;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num = (EditText) findViewById(R.id.editTextNumber);
        result = (TextView) findViewById(R.id.textView2);
        btn = (Button) findViewById(R.id.Button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nums = num.getText().toString();
                if(nums.equals("")){
                    result.setText("Field is empty!");
                }
                else {
                    int number = Integer.parseInt(nums);
                    tri t = new tri(number);
                    boolean checktri = t.isTriangular();
                    sq s = new sq(number);
                    boolean checksq = s.checkPerfectSquare();

                    if(checksq && checktri){
                        result.setText("The number is both Triangular and Square! Huraaayyy!");
                    }
                    else if(checksq){
                        result.setText("The number is only Square!");
                    }
                    else if(checktri){
                        result.setText("The number is only Triangular!");
                    }
                    else{
                        result.setText("The number is neither Square nor Triangular!");
                    }
                }
            }
        });
    }
}