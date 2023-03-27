package com.example.aula2_27022023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import kotlin.reflect.KFunction;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button button;
    int x = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.foto);
        button = findViewById(R.id.button);

        if(x == 1) {
            x = 2;
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageView.setImageResource(R.drawable.alanzoka);
                }
            });
        } else if (x == 2) {
            x = 1;
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageView.setImageResource(R.drawable.img);
                }
            });
        }
    }
}