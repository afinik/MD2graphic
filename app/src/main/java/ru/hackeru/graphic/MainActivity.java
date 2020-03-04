package ru.hackeru.graphic;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button btn_trans = findViewById(R.id.btn_trans);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.todelete);
        btn_trans.startAnimation(animation);
        TextView textView = findViewById(R.id.txt_button);
        AnimatorSet animator = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.anim_fly);
        ObjectAnimator objectAnimator = new ObjectAnimator();
        animator.setTarget(findViewById(R.id.txt_button));
        animator.start();

//        Button button = findViewById(R.id.ok_button);
//        View.OnClickListener onClickListener = new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        };
    }


}
