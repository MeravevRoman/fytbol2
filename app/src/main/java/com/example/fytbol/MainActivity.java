package com.example.fytbol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView ImageView8;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageview = (ImageView) findViewById(R.id.imageView8);

        Button startFallingButton = (Button) findViewById(R.id.button);

        final Animation fallingAnimation = AnimationUtils.loadAnimation(this,
                R.anim.falling);

        startFallingButton.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view)  {
               ImageView.startAnimation(fallingAnimation);
            }
        });
    }
}