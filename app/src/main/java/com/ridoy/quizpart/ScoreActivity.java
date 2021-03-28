package com.ridoy.quizpart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    private TextView scoretxt,score;
    private Button done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        score=findViewById(R.id.scorescreenscoreid);
        done=findViewById(R.id.scorescreenbuttonid);
        String scorestring=getIntent().getStringExtra("score");
        score.setText(scorestring);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ScoreActivity.this,MainActivity.class);
                startActivity(intent);
                ScoreActivity.this.finish();
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent=new Intent(ScoreActivity.this,MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}