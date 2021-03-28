package com.ridoy.quizpart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import static java.lang.Thread.sleep;

public class SplashActivity extends AppCompatActivity {
    private TextView splashscreenappname;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference();

        splashscreenappname=findViewById(R.id.SplashscreenappNameid);
        imageView=findViewById(R.id.splashscreenimageViewid);

        Typeface typeface= ResourcesCompat.getFont(this,R.font.blacklist);

        splashscreenappname.setTypeface(typeface);

        Animation animation= AnimationUtils.loadAnimation(this,R.anim.myanim);

        splashscreenappname.setAnimation(animation);


        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Intent intent= new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);
                SplashActivity.this.finish();
            }
        }).start();


    }
}