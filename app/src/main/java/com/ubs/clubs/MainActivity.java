package com.ubs.clubs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button joinclub_button, myclubs_button, createclub_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        joinclub_button = findViewById(R.id.joinclub_button);
        myclubs_button = findViewById(R.id.myclubs_button);
        createclub_button = findViewById(R.id.createclub_button);

        joinclub_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MainActivity.this,JoinClubActivity.class);
                startActivity(intent);
            }

        });

        myclubs_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MainActivity.this,MyClubsActivity.class);
                startActivity(intent);
            }

        });

        createclub_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MainActivity.this,CreateClubActivity.class);
                startActivity(intent);
            }

        });
    }
}