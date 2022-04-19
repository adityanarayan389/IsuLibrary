package com.example.isulibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.parcelblelibrary.Pojo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ShowData.Show(this,"library");

        if(getIntent().hasExtra("data")){
            Pojo name = getIntent().getParcelableExtra("data");
            Toast.makeText(MainActivity.this,name.getUserName(),Toast.LENGTH_LONG).show();
        }

    }
}