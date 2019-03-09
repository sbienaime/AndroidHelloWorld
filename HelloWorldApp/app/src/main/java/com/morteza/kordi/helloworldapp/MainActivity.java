package com.morteza.kordi.helloworldapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     void ButtonIsClicked(View buttonView){
         int result = 5*7;
         //TextView showtext = findViewById(R.id.textView);
          TextView edtName = findViewById(R.id.editText);

         Log.i("OPERATION", edtName.getText().toString());





     }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
