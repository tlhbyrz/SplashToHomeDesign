package com.example.boyraztalha.splashtohomedesign;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    ImageView imageView;
    TextView description ,l1t1,l1t2,l2t1,l2t2,l3t1,l3t2;
    Button button;
    LinearLayout linearLayout1,linearLayout2,linearLayout3;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        animation = AnimationUtils.loadAnimation(this,R.anim.smalltobigimg);

        button = findViewById(R.id.btn1);
        description = findViewById(R.id.desc);
        imageView = findViewById(R.id.img1);
        linearLayout1 = findViewById(R.id.ll1);
        linearLayout2 = findViewById(R.id.ll2);
        linearLayout3 = findViewById(R.id.ll3);
        l1t1 = findViewById(R.id.l1t1);
        l1t2 = findViewById(R.id.l1t2);
        l2t1 = findViewById(R.id.l2t1);
        l2t2 = findViewById(R.id.l2t2);
        l3t1 = findViewById(R.id.l3t1);
        l3t2 = findViewById(R.id.l3t2);

        Typeface Montserrat_Regular = Typeface.createFromAsset(getAssets(),"fonts/MontserratRegular.ttf");
        Typeface Montserrat_Light = Typeface.createFromAsset(getAssets(),"fonts/MontserratLight.ttf");
        Typeface Montserrat_Medium = Typeface.createFromAsset(getAssets(),"fonts/MontserratMedium.ttf");

        description.setTypeface(Montserrat_Regular);
        button.setTypeface(Montserrat_Medium);
        l1t1.setTypeface(Montserrat_Regular);
        l2t1.setTypeface(Montserrat_Regular);
        l3t1.setTypeface(Montserrat_Regular);

        l1t2.setTypeface(Montserrat_Light);
        l2t2.setTypeface(Montserrat_Light);
        l3t2.setTypeface(Montserrat_Light);

        linearLayout1.setAlpha(0);
        linearLayout2.setAlpha(0);
        linearLayout3.setAlpha(0);
        description.setAlpha(0);
        button.setAlpha(0);

        linearLayout1.setTranslationX(800);
        linearLayout2.setTranslationX(800);
        linearLayout3.setTranslationX(800);
        description.setTranslationY(400);
        button.setTranslationY(400);

        imageView.setAnimation(animation);
        linearLayout1.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(400).start();
        linearLayout2.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(600).start();
        linearLayout3.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(800).start();
        description.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(400).start();
        button.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(400).start();




    }
}
