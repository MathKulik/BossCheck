package com.terraria.bosscheck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class hardmode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hardmode);
    }
    public void Corruption( View view ) {
        Intent intent = new Intent(this, preHardC.class);
        startActivity(intent);

    }
    public void Carmin( View view ) {
        Intent intent = new Intent(this, preHardCa.class);
        startActivity(intent);
    }
}