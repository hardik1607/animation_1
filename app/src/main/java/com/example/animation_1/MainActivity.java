package com.example.animation_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView i1;
Button b1;
Animation ani;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i1 = findViewById(R.id.i1);
        b1 = findViewById(R.id.b1);

        ani = AnimationUtils.loadAnimation(this,R.anim.animation);
        i1.startAnimation(ani);

    }

    public void fade_in_animation(View view) {
        ani = AnimationUtils.loadAnimation(this,R.anim.animation);
        i1.startAnimation(ani);

    }

    public void fade_out_animation(View view) {
        ani = AnimationUtils.loadAnimation(this,R.anim.fade_out_animation);
        i1.startAnimation(ani);


    }

    public void blink_animation(View view) {
        ani = AnimationUtils.loadAnimation(this,R.anim.blink_animation);
        i1.startAnimation(ani);

    }

    public void Zoom_In_Animation(View view) {
        ani = AnimationUtils.loadAnimation(this,R.anim.zoom_in_animation);
        i1.startAnimation(ani);

    }

    public void zoom_out_animation(View view) {
        ani = AnimationUtils.loadAnimation(this,R.anim.zoom_out_animation);
        i1.startAnimation(ani);

    }

    public void Rotate_Animation(View view) {
        ani = AnimationUtils.loadAnimation(this,R.anim.rotate_animation);
        i1.startAnimation(ani);

    }

    public void Move_Animation(View view) {
        ani = AnimationUtils.loadAnimation(this,R.anim.move_animation);
        i1.startAnimation(ani);

    }

    public void Slide_Up_Animation(View view) {
        ani = AnimationUtils.loadAnimation(this,R.anim.slide_up_animation);
        i1.startAnimation(ani);

    }

    public void Slide_Down_Animation(View view) {
        ani = AnimationUtils.loadAnimation(this,R.anim.slide_down_animation);
        i1.startAnimation(ani);

    }

    public void Bounce_Animation(View view) {
        ani = AnimationUtils.loadAnimation(this,R.anim.bounce_animation);
        i1.startAnimation(ani);

    }

    public void sequential_animation(View view) {
        ani = AnimationUtils.loadAnimation(this,R.anim.sequential_animation);
        i1.startAnimation(ani);

    }

    public void Together_Animation(View view) {
        ani = AnimationUtils.loadAnimation(this,R.anim.together_animation);
        i1.startAnimation(ani);

    }
}