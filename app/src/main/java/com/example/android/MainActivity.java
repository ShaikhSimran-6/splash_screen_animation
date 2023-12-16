package com.example.android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    Button btn;
    TextView text_1;
    TextView text_2;
    ImageView imageView;

    Animation animate_btn;
    Animation animate_text;

    Animation animate_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.get_started_btn);
        text_1 = findViewById(R.id.text_1);
        text_2 = findViewById(R.id.text_2);
        imageView = findViewById(R.id.image);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SignInSignUpActivity.class);
                startActivity(intent);
            }
        });


//        Add the animation.

        animate_btn = AnimationUtils.loadAnimation(this, R.anim.animate_btn);
        btn.setAnimation(animate_btn);

        animate_text = AnimationUtils.loadAnimation(this, R.anim.animate_btn);
        btn.setAnimation(animate_text);

        animate_img = AnimationUtils.loadAnimation(this, R.anim.animate_img);
        btn.setAnimation(animate_img);

        btn.setAnimation(animate_btn);

//      Animation for the text

        text_1.setAnimation(animate_text);
        text_2.setAnimation(animate_text);

        imageView.setAnimation(animate_img);

    }


}