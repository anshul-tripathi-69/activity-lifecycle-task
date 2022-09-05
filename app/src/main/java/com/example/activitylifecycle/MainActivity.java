package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private Button mNavigateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNavigateButton = findViewById(R.id.navigate_button);
        mNavigateButton.setOnClickListener(
            view -> {
                Intent secondaryActivityIntent =
                        new Intent(MainActivity.this, SecondaryActivity.class);
                startActivity(secondaryActivityIntent);
            }
        );

        Log.d(TAG, "onCreate called");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "onStop called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(TAG, "onRestart called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "onDestroy called");
    }
}