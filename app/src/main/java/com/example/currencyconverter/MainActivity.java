package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){
        ImageView imageView= (ImageView) findViewById((R.id.imageView));
        ImageView imageView2= (ImageView) findViewById((R.id.imageView2));

        imageView.animate().alpha(0).setDuration(500);
        imageView2.animate().alpha(1).setDuration(500);

        EditText editTextTextPersonName = (EditText) findViewById((R.id.editTextTextPersonName));
        String amountInDollars = editTextTextPersonName.getText().toString();
        double amountInDollarsDouble = Double.parseDouble(amountInDollars);
        double amountInRupeesDouble = amountInDollarsDouble*76.63;
        String amountInRupeesString = String.format("%.2f",amountInRupeesDouble);
        Toast.makeText(this, ""+ amountInDollars + " $ is "  + amountInRupeesString +"₹", Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}