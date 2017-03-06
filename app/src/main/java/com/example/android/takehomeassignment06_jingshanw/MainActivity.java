package com.example.android.takehomeassignment06_jingshanw;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import static com.example.android.takehomeassignment06_jingshanw.R.id.total;

public class MainActivity extends AppCompatActivity {

    private TextView amount;
    private TextView taxPercentage;
    private TextView tipPercentage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amount= (TextView) findViewById(R.id.amount_text_view);
        taxPercentage= (TextView) findViewById(R.id.tax_percentage);
        tipPercentage= (TextView) findViewById(R.id.tip_percentage);

    }

    public void submit(View view)
    {
        Intent intent=new Intent(this,SecondActivity.class);
        int total=Integer.parseInt(amount.getText().toString());
        intent.putExtra("AMOUNT",total);
        startActivity(intent);

        Intent intent2=new Intent(this,SecondActivity.class);
        int taxP=Integer.parseInt(taxPercentage.getText().toString());
        int salesTax=total*taxP;
        intent2.putExtra("TAX",salesTax);
        startActivity(intent2);

        Intent intent3=new Intent(this,SecondActivity.class);
        int tipP=Integer.parseInt(tipPercentage.getText().toString());
        int tip=total*tipP;
        intent2.putExtra("TIPS",tip);
        startActivity(intent3);

        Intent intent4=new Intent(this,SecondActivity.class);
        int grand=total+salesTax+tip;
        intent2.putExtra("GRAND",grand);
        startActivity(intent4);




    }


    }

