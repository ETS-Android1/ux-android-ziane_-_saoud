package com.example.oldktab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void commencer(View view) {
        Log.d(LOG_TAG, "Passed to next activity!");
        Intent intent = new Intent(this, Connexion_Activity.class);
        startActivity(intent);
    }
}