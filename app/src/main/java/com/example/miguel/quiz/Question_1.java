package com.example.miguel.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Question_1 extends AppCompatActivity {

    public Question_Library question_library = new Question_Library();

    public TextView correct_counter;
    public Button choice1;
    public Button choice2;
    public Button choice3;
    public TextView question_viewer;

    public String correct_answer;
    public int score=0;
    public int question_number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_1);

        correct_counter = (TextView) findViewById(R.id.txtCount);
        choice1 = (Button) findViewById(R.id.button_choice1);
        choice2 = (Button) findViewById(R.id.button_choice2);
        choice3 = (Button) findViewById(R.id.button_choice3);
        question_viewer = (TextView) findViewById(R.id.txtQuestion);

        updateQ();

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(choice1.getText() == correct_answer ){
                    score = score+1;
                    correct_counter.setText(""+score);
                    Toast.makeText(Question_1.this, "Correct", Toast.LENGTH_SHORT).show();

                    updateQ();
                }

                else{
                    Toast.makeText(Question_1.this,"Incorrect", Toast.LENGTH_SHORT).show();
                    updateQ();
                }
            }
        });

        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(choice2.getText() == correct_answer ){
                    score = score+1;
                    correct_counter.setText(""+score);
                    Toast.makeText(Question_1.this, "Correct", Toast.LENGTH_SHORT).show();

                    updateQ();
                }

                else{
                    Toast.makeText(Question_1.this,"Incorrect", Toast.LENGTH_SHORT).show();
                    updateQ();
                }
            }
        });

        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(choice3.getText() == correct_answer ){
                    score = score+1;
                    correct_counter.setText(""+score);
                    Toast.makeText(Question_1.this, "Correct", Toast.LENGTH_SHORT).show();

                    updateQ();
                }

                else{
                    Toast.makeText(Question_1.this,"Incorrect", Toast.LENGTH_SHORT).show();
                    updateQ();
                }
            }
        });

    }

    public void goToScore() {
        if(question_number == 1){
            Intent go = new Intent(Question_1.this,Score.class);
            startActivity(go);
        }

    }

    public void updateQ(){
            question_viewer.setText(question_library.getQuestion(question_number));
            choice1.setText(question_library.getChoice1(question_number));
            choice2.setText(question_library.getChoice2(question_number));
            choice3.setText(question_library.getChoice3(question_number));

            correct_answer = question_library.correctAns(question_number);

            question_number++;


    }
}

