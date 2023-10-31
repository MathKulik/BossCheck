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
    public void volta( View view ) {
        Intent intent = new Intent(this, preHardC.class);
        startActivity(intent);
        //TODO: ver como fazer um botão voltar para outro lugar dependendo da escolha feita da primeira vez

        //TODO: aprender como fazer uma parte escrolavel
    }
}