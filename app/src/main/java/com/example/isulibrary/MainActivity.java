package com.example.isulibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.parcelblelibrary.ShowData;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ShowData.Show(this,"library");

        if(getIntent().hasExtra("data")){
            ShowData name = getIntent().getParcelableExtra("data");
            Toast.makeText(MainActivity.this,name.toString(),Toast.LENGTH_LONG).show();
        }

    }
}