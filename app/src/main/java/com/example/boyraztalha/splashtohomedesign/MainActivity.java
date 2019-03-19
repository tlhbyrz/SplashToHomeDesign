package com.example.boyraztalha.splashtohomedesign;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView1,textView2;
    Button button1;
    ImageView imageView;
    Animation smallToBig,slide_in_right,slide_in_left;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.txt1);
        textView2 = findViewById(R.id.txt2);
        button1 = findViewById(R.id.btn1);
        imageView = findViewById(R.id.img1);

        smallToBig = AnimationUtils.loadAnimation(this,R.anim.smalltobig);
        slide_in_right = AnimationUtils.loadAnimation(this,R.anim.slide_in_right);
        slide_in_left = AnimationUtils.loadAnimation(this,R.anim.slide_in_left);

        Typeface fredoka = Typeface.createFromAsset(getAssets(),"fonts/Fredoka.ttf");
        Typeface Montserrat_Light = Typeface.createFromAsset(getAssets(),"fonts/MontserratLight.ttf");
        Typeface Montserrat_Medium = Typeface.createFromAsset(getAssets(),"fonts/MontserratMedium.ttf");
        //Typeface Montserrat_Regular = Typeface.createFromAsset(getAssets(),"fonts/MontserratRegular.ttf");

        textView1.setTypeface(fredoka);
        textView2.setTypeface(Montserrat_Light);
        button1.setTypeface(Montserrat_Medium);

        imageView.setAnimation(smallToBig);

        textView1.setAlpha(0);
        textView2.setAlpha(0);
        button1.setAlpha(0);

        textView1.setTranslationX(400);
        textView2.setTranslationX(400);
        button1.setTranslationX(400);

        textView1.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(400).start();
        textView2.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(600).start();
        button1.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(800).start();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_in_left);
            }
        });

    }
}
