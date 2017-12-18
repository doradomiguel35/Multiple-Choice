package com.example.miguel.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class User_Login extends AppCompatActivity {

    public EditText user_login;
    public EditText pass_login;
    public Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user__login);

        user_login = (EditText) findViewById(R.id.username);
        pass_login = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.button_login);
        
        final String user_name = (String) user_login.getText().toString();
        final String pass_word = (String) pass_login.getText().toString();
        
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login(user_name,pass_word);
            }
        });
        


    }
    public void login(String username,String password){
        if(username.equals("admin") && password.equals("admin")){
            Toast.makeText(User_Login.this,"Logged in as "+username,Toast.LENGTH_LONG).show();
            Intent toy = new Intent(User_Login.this, Question_1.class);
            startActivity(toy);
        }
        else{
            Toast.makeText(User_Login.this,"Incorrect",Toast.LENGTH_SHORT).show();
        }
    }
}
