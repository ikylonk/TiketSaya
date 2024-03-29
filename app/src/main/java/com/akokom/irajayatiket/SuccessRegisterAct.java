package com.akokom.irajayatiket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SuccessRegisterAct extends AppCompatActivity {

    Button btn_explore;
    Animation app_splash, bottomtotopalpha, toptobottomalpha;
    ImageView icon_success;
    TextView app_title, app_subtitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_register);
        btn_explore = findViewById(R.id.btn_explore);
        icon_success = findViewById(R.id.icon_success);
        app_title = findViewById(R.id.app_title);
        app_subtitle = findViewById(R.id.app_subtittle);

        //load animation
        app_splash = AnimationUtils.loadAnimation(this, R.anim.app_splash);
        bottomtotopalpha = AnimationUtils.loadAnimation(this,R.anim.bottomtotopalpha);
        toptobottomalpha = AnimationUtils.loadAnimation(this, R.anim.toptobottomalpha);

        //run animation
        btn_explore.startAnimation(bottomtotopalpha);
        icon_success.startAnimation(app_splash);
        app_title.startAnimation(toptobottomalpha);
        app_subtitle.startAnimation(toptobottomalpha);

        btn_explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotohome = new Intent(SuccessRegisterAct.this, HomeAct.class);
                startActivity(gotohome);
            }
        });
    }
}
