package com.example.application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    ImageView home=findViewById(R.id.home);
    ImageView message=findViewById(R.id.message);
    ImageView notifactions=findViewById(R.id.notifcations);
    ImageView abcense=findViewById(R.id.abcense);
    Button logout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logout=findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logout();
            }
        });


    }
    public void logout(){
        Intent i= new Intent(MainActivity.this,signin.class);
        FirebaseAuth.getInstance().signOut();
        startActivity(i);
    }
}
