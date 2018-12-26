package com.morepranit.animationsdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class AnimationActivity extends AppCompatActivity {
    private String animationName;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        Intent intent = getIntent();
        animationName = intent.getStringExtra("animation_name");

        textView = findViewById(R.id.tv_text);
    }

    public void onStartAnimation(View view) {
        Animation animation;
        switch (animationName) {
            case "fadein":
                animation = AnimationUtils.loadAnimation(AnimationActivity.this, R.anim.fade_in);
                textView.startAnimation(animation);
                break;
            case "fadeout":
                animation = AnimationUtils.loadAnimation(AnimationActivity.this, R.anim.fade_out);
                textView.startAnimation(animation);
                break;
            case "zoomin":
                animation = AnimationUtils.loadAnimation(AnimationActivity.this, R.anim.zoom_in);
                textView.startAnimation(animation);
                break;
            case "zoomout":
                animation = AnimationUtils.loadAnimation(AnimationActivity.this, R.anim.zoom_out);
                textView.startAnimation(animation);
                break;
            case "blink":
                animation = AnimationUtils.loadAnimation(AnimationActivity.this, R.anim.blink);
                textView.startAnimation(animation);
                break;
            case "rotate":
                animation = AnimationUtils.loadAnimation(AnimationActivity.this, R.anim.rotate);
                textView.startAnimation(animation);
                break;
            case "move":
                animation = AnimationUtils.loadAnimation(AnimationActivity.this, R.anim.move);
                textView.startAnimation(animation);
                break;
            case "slideup":
                animation = AnimationUtils.loadAnimation(AnimationActivity.this, R.anim.slide_up);
                textView.startAnimation(animation);
                break;
            case "slidedown":
                animation = AnimationUtils.loadAnimation(AnimationActivity.this, R.anim.slide_down);
                textView.startAnimation(animation);
                break;
            case "bounce":
                animation = AnimationUtils.loadAnimation(AnimationActivity.this, R.anim.bounce);
                textView.startAnimation(animation);
                break;
            case "sequential":
                animation = AnimationUtils.loadAnimation(AnimationActivity.this, R.anim.sequential);
                textView.startAnimation(animation);
                break;
            case "together":
                animation = AnimationUtils.loadAnimation(AnimationActivity.this, R.anim.together);
                textView.startAnimation(animation);
                break;
            default:
        }
    }
}
