package com.ubuntu.khor_jia_quan_quiz2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.lang.Exception;

public class MainActivity extends AppCompatActivity {
    private Button button1;

    private EditText A;
    private EditText B;
    private EditText C;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        button1 = (Button) findViewById(R.id.button1);
        A = (EditText) findViewById(R.id.A);
        B = (EditText) findViewById(R.id.B);
        C = (EditText) findViewById(R.id.C);
        TextView result = (TextView) findViewById(R.id.Result);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    double r = Double.parseDouble(A.getText().toString())+Double.parseDouble(B.getText().toString())+Double.parseDouble(C.getText().toString());
                    result.setText("" + r);
                }
                catch (Exception e){
                    result.setText("Invalid Input");
                }
            }
        });
    }
}