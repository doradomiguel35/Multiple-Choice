package com.example.miguel.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Score extends AppCompatActivity {

    public Question_1 scores = new Question_1();
    public TextView txtfinal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        txtfinal = (TextView) findViewById(R.id.txtfinal_score);
        txtfinal.setText(scores.score);

    }
}
