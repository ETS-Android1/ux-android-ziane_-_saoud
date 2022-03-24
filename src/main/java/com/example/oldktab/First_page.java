package com.example.oldktab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class First_page extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_page);
    }

    public void annonces_btn(View view) {
        Log.d(LOG_TAG, "Passed to next activity!");
        Intent intent = new Intent(this, Annonces.class);
        startActivity(intent);
    }
}