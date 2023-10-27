package com.example.jalase8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String ghad(int num){

        if (0<num && num <=100){
            return "short";
        }else if(101<=num && num <=200){
            return "med";
        }else if(201<=num && num <=300){
            return "tgadc";
        } else{
            return "wrong";
        }

    }

    String change(int number){
         String output = "";
        for(int i = 0; i <= number; i++){
            output += i;
        }
        return output;

    }

    int max(int a,int b,int c){
        if ( a>=b && a>=c) {
           return a;
        }else if(b>=a && b>=c) {
            return b;
        }else if(c>=a && c>=b){
            return c;
        }
        return 0;
    }

    String print(int num){
        String str= "w";
        for(int i=0;i<num;i++){
           str=str+"o";
           // str += "o";
        }
        str=str+"w!";
        return str;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);
        Button login = findViewById(R.id.login);
        // یک خطا زمان اجرا داریم و یک خطا دستوری یا نحوی که خطا نحوی یعنی درست کدت رو ننوشتی مثل نقطه ویرگول نگذاشتی
        // حال حتی اگه کدت از نظر نوشتاری درست نوشته شده باشه باز در زمان اجرا شاید یکسری خطا داشته باشی که به اون خطای زمان اجرا می گویند.
        Integer hasan = 1;
        Integer hossien = 2;
        boolean res = hasan.equals(hossien);
        Log.w("natijeh", String.valueOf(res));
        Log.w("natijeh", change(10));
        Log.w("natijeh", String.valueOf(max(1,2,3)));
        Log.w( "natijeh",print(5));


        String correctUsername = "reza";
        String correctPassword = "1234";

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals(correctUsername) && password.getText().toString().equals(correctPassword)){
                    Toast.makeText(MainActivity.this, "ورود با موفقیت انجام شد", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(MainActivity.this, "نام کاربری یا رمز عبور اشتباه است", Toast.LENGTH_LONG).show();
                }
            }
        });

        // استفاده از ابزار لاگ در برنامه نویسی اندروید خیلی مهم است زیرا برای بررسی درست بودن کدمان می باشد.
        boolean t = correctPassword.equals("1234");
        Log.w("testman", String.valueOf(t));
        Log.w("mkia",ghad(45));

    }
}