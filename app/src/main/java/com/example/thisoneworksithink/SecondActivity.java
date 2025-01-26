package com.example.thisoneworksithink;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Retrieve the text passed from MainActivity
        String receivedText = getIntent().getStringExtra("inputText");

        // Initialize the button
        Button showToastButton = findViewById(R.id.showToastButton);

        // Set the button click listener
        showToastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show a Toast with the received text
                Toast.makeText(SecondActivity.this, receivedText, Toast.LENGTH_SHORT).show();
            }
        });
    }
}