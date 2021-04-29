package com.ubs.clubs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateClubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_club);

        EditText NewClubName = (EditText) findViewById(R.id.NewClubName);
        String clubname = NewClubName.getText().toString();

        EditText NewClubDescription = (EditText) findViewById(R.id.NewClubDescription);
        String clubdescription = NewClubDescription.getText().toString();

//        submitcreateclub_button =findViewById(R.id.submitcreateclub_button)
//
//        submitcreateclub_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent (CreateClubActivity.this,JoinClubActivity.class);
//                startActivity(intent);
//            }
//
//        });

    }
}