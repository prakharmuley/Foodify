package com.example.android.foodify;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;
import android.view.WindowManager.LayoutParams;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button login,signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   getWindow().setFlags(
           WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
           WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
   );
   getSupportActionBar().hide();
   login=findViewById(R.id.button);
   signin=findViewById(R.id.button2);
   login.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           Toast.makeText(MainActivity.this,"Login has been Clicked", Toast.LENGTH_LONG).show();
           Intent intent=new Intent(MainActivity.this,SignIn.class);
           startActivity(intent);
       }
   });
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Sign In has been Clicked", Toast.LENGTH_LONG).show();
                Intent intent=new Intent(MainActivity.this,SignUp.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.textView2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Food on my table",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(MainActivity.this,FoodMenu.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public void onBackPressed() {
               new AlertDialog.Builder(MainActivity.this)
               .setIcon(R.drawable.ic_baseline_warning_24)
                       .setTitle("Exit")
               .setMessage("Are you sure want to exit the app?")
                       .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                           @Override
                           public void onClick(DialogInterface dialogInterface, int i) {
                               moveTaskToBack(true);
                           }
                       })
               .setNegativeButton("No", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialogInterface, int i) {
                       dialogInterface.dismiss();
                   }

               })
                       .show();
           }

    }

//    @Override
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        if(keyCode==KeyEvent.KEYCODE_BACK) moveTaskToBack(true);
//        return super.onKeyDown(keyCode, event);
//    }
