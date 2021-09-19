package com.example.android.foodify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getSupportActionBar().setTitle("Sign Up");
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
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
       findViewById(R.id.sgnin_sgnup).setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent=new Intent(SignUp.this,SignIn.class);
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