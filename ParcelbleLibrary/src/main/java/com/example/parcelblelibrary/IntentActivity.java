package com.example.parcelblelibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class IntentActivity extends AppCompatActivity {
   public String name,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        if(getIntent().hasExtra("data")){
            Pojo data = getIntent().getParcelableExtra("data");
             name = data.getUserName();
             password = data.getPassWord();

            Toast.makeText(IntentActivity.this,data.getId(),Toast.LENGTH_LONG).show();
        }


    }
}