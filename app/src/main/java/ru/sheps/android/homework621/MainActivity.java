package ru.sheps.android.homework621;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int activityNumber = 0;
    private static final String TAG = "Lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnBack = findViewById(R.id.buttonBack);
        Button btnNext = findViewById(R.id.buttonNext);
        TextView textView = findViewById(R.id.name);
        Random random = new Random();
        activityNumber = random.nextInt(100);
        textView.setText("http://myfile.org/" + activityNumber);

    }


    public void onClickNext(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void onClickBack(View view) {
        finish();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, activityNumber + " onStart: " + this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, activityNumber + " onResume: " + this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, activityNumber + " onPause: " + this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, activityNumber + " onStop: " + this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, activityNumber + " onDestroy: " + this);
    }

}

