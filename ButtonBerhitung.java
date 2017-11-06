package com.iak.teddy.latihaniakk;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by Teddy on 04/11/2017.
 */

public class teddy extends AppCompatActivity {
    private Button tambahA, kurangA, resetA, tambahB, kurangB, resetB;
    private TextView nilaiA, nilaiB;
    private int a=0, b=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teddy);

        tambahA= (Button) findViewById(R.id.btn_pls);
        tambahB= (Button) findViewById(R.id.btn_pls2);
        kurangA= (Button) findViewById(R.id.btn_minus);
        kurangB= (Button) findViewById(R.id.btn_minus2);
        resetA= (Button) findViewById(R.id.btn_reset);
        resetB= (Button) findViewById(R.id.btn_reset2);

        nilaiA= (TextView) findViewById(R.id.tv_nilai);
        nilaiB= (TextView) findViewById(R.id.tv_nilai2);

        tambahA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a+=1;
                nilaiA.setText(""+a);
            }
        });

        kurangA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a<0) {
                    Toast.makeText(teddy.this, "The Score is 0", Toast.LENGTH_SHORT).show();
                    return;
                }
                else{
                a-=1;
                nilaiA.setText(""+a);
            }
        }});
        resetA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=0;

                nilaiA.setText(""+a);
            }
        });

        tambahB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            b+=1;
            nilaiB.setText(""+b);
                }
        });

        kurangB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            if (a<0) {
            Toast.makeText(teddy.this, "The Score is 0" ,Toast.LENGTH_SHORT).show();
            return;
            }
            else{
            b-=1;
            nilaiB.setText(""+b);
            }
        }});
        resetB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            b=0;

        nilaiB.setText(""+b);
            }
        });

    }
}
