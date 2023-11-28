package com.terraria.bosscheck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class slime extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slime);

        findViewById(R.id.wiki).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://terraria.wiki.gg/pt/wiki/Geleia_Rei");
            }
        });
        findViewById(R.id.solidificador).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://terraria.wiki.gg/pt/wiki/Solidificador");
            }
        });
        findViewById(R.id.sela).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://terraria.wiki.gg/pt/wiki/Sela_de_Geleia");
            }
        });
        findViewById(R.id.capuz).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://terraria.wiki.gg/pt/wiki/Armadura_de_Ninja");
            }
        });
        findViewById(R.id.camisa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://terraria.wiki.gg/pt/wiki/Armadura_de_Ninja");
            }
        });
        findViewById(R.id.calca).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://terraria.wiki.gg/pt/wiki/Armadura_de_Ninja");
            }
        });
        findViewById(R.id.gancho).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://terraria.wiki.gg/pt/wiki/Gancho_de_Geleia");
            }
        });
        findViewById(R.id.armageleia).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://terraria.wiki.gg/pt/wiki/Arma_de_Geleia");
            }
        });
        findViewById(R.id.pocao).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://terraria.wiki.gg/pt/wiki/Po%C3%A7%C3%A3o_de_Cura_Simples");
            }
        });
        findViewById(R.id.mascara).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://terraria.wiki.gg/pt/wiki/M%C3%A1scara_da_Geleia_Rei");
            }
        });
        findViewById(R.id.trofeu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://terraria.wiki.gg/pt/wiki/Trof%C3%A9us");
            }
        });

        findViewById(R.id.treasureKing).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://terraria.wiki.gg/pt/wiki/Bolsas_de_Tesouro");
            }
        });

        findViewById(R.id.gelReal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://terraria.wiki.gg/pt/wiki/Gel_Real");
            }
        });
        findViewById(R.id.coin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://terraria.wiki.gg/pt/wiki/Moeda_de_Ouro");
            }
        });
        findViewById(R.id.treasureKingg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://terraria.wiki.gg/pt/wiki/Bolsas_de_Tesouro");
            }
        });

        findViewById(R.id.gelReall).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://terraria.wiki.gg/pt/wiki/Gel_Real");
            }
        });
        findViewById(R.id.coinn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://terraria.wiki.gg/pt/wiki/Moeda_de_Ouro");
            }
        });
        findViewById(R.id.royal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://terraria.wiki.gg/pt/wiki/Animais_de_estima%C3%A7%C3%A3o");
            }
        });
        findViewById(R.id.relic).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://terraria.wiki.gg/pt/wiki/Rel%C3%ADquia_da_Geleia_Rei");
            }
        });
    }

    public void volta(View view) {
        Intent intent = new Intent(this, preHardCa.class);
        startActivity(intent);
    }

    public void clicked_btn(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }


}