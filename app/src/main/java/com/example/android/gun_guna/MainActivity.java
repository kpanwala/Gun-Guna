package com.example.android.gun_guna;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       TextView bolly=(TextView)findViewById(R.id.bollywood);

        bolly.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, Bollywood.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        TextView holly=(TextView)findViewById(R.id.hollywood);

        holly.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, Hollywood.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        TextView jazz=(TextView)findViewById(R.id.jazz);

        jazz.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, Jazz.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        TextView hiphop=(TextView)findViewById(R.id.hiphop);

        hiphop.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, Hiphop.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        TextView romantic=(TextView)findViewById(R.id.romantic);

        romantic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, Romantic.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

    }
}
