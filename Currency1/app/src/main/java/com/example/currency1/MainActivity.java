package com.example.currency1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void fun(View view){
        EditText rupeeAmount = findViewById(R.id.editText);
        String rupeeString = rupeeAmount.getText().toString();
        Double rupeeDouble = Double.parseDouble(rupeeString);
        Double riyalDouble = rupeeDouble * 0.051;
        String riyalString = String.format("%.2f", riyalDouble);
        String toast = "= "+riyalString+" Saudi Riyal";

        Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}