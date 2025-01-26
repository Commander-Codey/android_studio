package com.example.thisoneworksithink;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the EditText and Button
        EditText editText = findViewById(R.id.editText);
        Button launchButton = findViewById(R.id.launchButton);

        // Set the button click listener
        launchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the text from the EditText
                String inputText = editText.getText().toString().trim();

                // Create an Intent to start the SecondActivity
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                // Pass the text as extra data
                intent.putExtra("inputText", inputText);

                // Start the second activity
                startActivity(intent);
            }
        });
    }
}