package com.terraria.bosscheck;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void corruption( View view ) {
        Intent intent = new Intent(this, preHardC.class);
        startActivity(intent);
    }
    public void crimson(View view){
        Intent intent = new Intent(this, preHardCa.class);
        startActivity(intent);
    }

}

