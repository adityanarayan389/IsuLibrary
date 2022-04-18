package com.example.parcelblelibrary;

import android.content.Context;
import android.widget.Toast;

public class ShowData {
    public static void Show(Context context, String string){
        Toast.makeText(context,string,Toast.LENGTH_LONG).show();
    }
}
