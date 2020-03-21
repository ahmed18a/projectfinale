package com.example.application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class signin extends AppCompatActivity {
    private FirebaseAuth auth;
    EditText email = findViewById(R.id.email);
    Button signin=findViewById(R.id.signin);
    EditText password = findViewById(R.id.password);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        Intent i = new Intent(signin.this, profile.class);
        String strName = null;
        i.putExtra(email.getText().toString(), strName);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email.getText().toString().isEmpty())
                    email.setError("please enter your mail");
                if(password.getText().toString().isEmpty())
                    password.setError("please enter password");
                signin();
            }
        });

    }
    public void signin(){
        auth.signInWithEmailAndPassword(email.getText().toString(), password.getText().toString())
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(com.example.application.signin.this,"succesfly signed in",Toast.LENGTH_SHORT).show();

                        }
                        else{
                            Toast.makeText(com.example.application.signin.this,"there was a problem please try again",Toast.LENGTH_SHORT).show();

                        }

                    }
                });
    }
}
