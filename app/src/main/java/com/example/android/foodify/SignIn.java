package com.example.android.foodify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        getSupportActionBar().setTitle("Sign In");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        findViewById(R.id.editTextTextPersonName5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://www.facebook.com/food_on_my_table_-110599464048518"));
                if(intent.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(intent);
                }
            }
        }) ;
        findViewById(R.id.editTextTextPersonName6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://mail.google.com/mail/u/0/#inbox"));
                if(intent.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(intent);
                }
            }
        }) ;
        findViewById(R.id.sgnin_sgnup).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignIn.this,SignUp.class);
                if(intent.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(intent);
                }
            }
        });
        findViewById(R.id.sgnin_sgnup).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SignIn.this,SignUp.class);
                if(intent.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(intent);
                }
            }
        });


    }
    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return super.onSupportNavigateUp();
    }


}