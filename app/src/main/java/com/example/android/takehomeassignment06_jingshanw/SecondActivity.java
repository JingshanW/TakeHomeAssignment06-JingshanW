package com.example.android.takehomeassignment06_jingshanw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.android.takehomeassignment06_jingshanw.R.id.total;

public class SecondActivity extends AppCompatActivity {

    private TextView totalAmount;
    private TextView salesTax;
    private TextView tip;
    private TextView grandTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        totalAmount= (TextView) findViewById(total);
        salesTax= (TextView) findViewById(R.id.sales_tax);
        tip= (TextView) findViewById(R.id.tip);
        grandTotal= (TextView) findViewById(R.id.grand_total);



        Intent intent=getIntent();
        int total=intent.getIntExtra("AMOUNT",0);
        totalAmount.setText("Total: "+total);

        Intent intent2=getIntent();
        int sales=intent2.getIntExtra("TAX",0);
        salesTax.setText("Sales Tax: "+sales);

        Intent intent3=getIntent();
        int tips=intent3.getIntExtra("TIPS",0);
        tip.setText("Tip: "+ tips);

        Intent intent4=getIntent();
        int grand=intent4.getIntExtra("GRAND",0);
        grandTotal.setText("Grand Total: "+ grand);
    }
}
