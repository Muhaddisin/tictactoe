package com.icin.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Menu_Utama extends AppCompatActivity{

    EditText inputnamaplayerOne, inputnamaplayerTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__utama);

        inputnamaplayerOne = findViewById(R.id.inputnamaplayerOne);
        inputnamaplayerTwo = findViewById(R.id.inputnamaplayerTwo);
    }

    public void pindah(View view) {
        Intent intent = new Intent(Menu_Utama.this, MainActivity.class);
        intent.putExtra("inputnamaplayerOne", inputnamaplayerOne.getText().toString());
        intent.putExtra("inputnamaplayerTwo", inputnamaplayerTwo.getText().toString());
        startActivity(intent);
    }
}