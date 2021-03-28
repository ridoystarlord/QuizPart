package com.ridoy.quizpart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mainscreenappname;
    private ImageView imageView;
    private Button startbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mainscreenappname=findViewById(R.id.mainactivitytextViewid);
        imageView=findViewById(R.id.MainactivityimageViewid);
        startbutton=findViewById(R.id.startbuttonid);

        Typeface typeface= ResourcesCompat.getFont(this,R.font.blacklist);
        mainscreenappname.setTypeface(typeface);

        startbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,QuestionsActivity.class);
                startActivity(intent);
            }
        });
    }
}