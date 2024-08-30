package com.example.lap1caculator;

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

public class MainActivity extends AppCompatActivity {
    EditText txtX,txtY;
    TextView txtKQ;
    Button btnCong,btnTru,btnNhan,btnChia,btnLayDu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        innitControl();
    }
    private void innitControl(){
        txtX =findViewById(R.id.txtX);
        txtY =findViewById(R.id.txtY);
        txtKQ =findViewById(R.id.txtKQ);
        btnCong =findViewById(R.id.btnCong);
        btnTru =findViewById(R.id.btnTru);
        btnNhan =findViewById(R.id.btnNhan);
        btnChia =findViewById(R.id.btnChia);
        btnLayDu =findViewById(R.id.btnLayDu);
        //tạo sự kiện nhấn nút
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x =Integer.parseInt(txtX.getText().toString());
                int y =Integer.parseInt(txtY.getText().toString());
                int kq= x+y;
                txtKQ.setText(String.valueOf(kq));
            }
        });
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x =Integer.parseInt(txtX.getText().toString());
                int y =Integer.parseInt(txtY.getText().toString());
                int kq= x-y;
                txtKQ.setText(String.valueOf(kq));
            }
        });
        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x =Integer.parseInt(txtX.getText().toString());
                int y =Integer.parseInt(txtY.getText().toString());
                int kq= x*y;
                txtKQ.setText(String.valueOf(kq));
            }
        });
        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x =Integer.parseInt(txtX.getText().toString());
                int y =Integer.parseInt(txtY.getText().toString());
                if (y != 0) {
                    double kq = (double) x / y;
                    txtKQ.setText(String.valueOf(kq));
                } else {
                    txtKQ.setText("Không thể chia cho 0");
                }
            }
        });
        btnLayDu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x =Integer.parseInt(txtX.getText().toString());
                int y =Integer.parseInt(txtY.getText().toString());
                if (y != 0) {
                    int kq = x % y;
                    txtKQ.setText(String.valueOf(kq));
                } else {
                    txtKQ.setText("Không thể chia cho 0");
                }
            }
        });
    }
}