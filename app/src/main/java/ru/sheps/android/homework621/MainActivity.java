package ru.sheps.android.homework621;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnBack = findViewById(R.id.buttonBack);
        Button btnNext = findViewById(R.id.buttonNext);
        TextView textView = findViewById(R.id.name);
        Random random = new Random();
        textView.setText("http://myfile.org/" + random.nextInt(100));

    }


    public void onClickNext(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void onClickBack(View view) {
        finish();
    }
}

