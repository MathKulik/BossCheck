package com.terraria.bosscheck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class preHardC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_hard_c);
    }
    public void volta( View view ) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void hard( View view ) {
        Intent intent = new Intent(this, hardmode.class);
        startActivity(intent);
    }
}