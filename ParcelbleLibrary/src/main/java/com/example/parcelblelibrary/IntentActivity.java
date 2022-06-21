package com.example.parcelblelibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class IntentActivity extends AppCompatActivity {
   public String name,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        if(getIntent().hasExtra("data")){
//            Pojo data = getIntent().getParcelableExtra("data");
//             name = data.getUserName();
//             password = data.getPassWord();
//            Toast.makeText(IntentActivity.this,data.getId(),Toast.LENGTH_LONG).show();
            try {
                ComponentName cName = new ComponentName("com.example.laststep", "com.example.laststep.MainActivity");
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.putExtra("data", getIntent().hasExtra("data"));
                intent.setComponent(cName);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }catch (Exception e){
                Toast.makeText(IntentActivity.this,"require application is not installed",Toast.LENGTH_LONG).show();
            }


        }


    }
}