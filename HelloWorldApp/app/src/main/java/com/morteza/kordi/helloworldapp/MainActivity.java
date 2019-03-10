package com.morteza.kordi.helloworldapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     void ButtonIsClicked(View buttonView){
         int result = 5*7;

         // links TextView UI component to code via id
         TextView showtext = findViewById(R.id.textView);
         TextView edtName = findViewById(R.id.editText2);
         //sends messages to logcat under information
        Log.i("OPERATION", edtName.getText().toString());


         Toast.makeText(MainActivity.this, showtext.getText().toString(), Toast.LENGTH_LONG).show();

     }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
