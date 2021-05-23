package com.example.eyedetectingvideoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.pd.lookatme.LookAtMe;

public class MainActivity extends AppCompatActivity {

    private LookAtMe lookAtMe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        View decorView = getWindow().getDecorView();
// Hide both the navigation bar and the status bar.
// SYSTEM_UI_FLAG_FULLSCREEN is only available on Android 4.1 and higher, but as
// a general rule, you should design your app to hide the status bar whenever you
// hide the navigation bar.
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        lookAtMe = findViewById(R.id.lookme);

        lookAtMe.init(this);
         lookAtMe.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.few));
        // lookAtMe.setVideoPath("https://file-examples-com.github.io/uploads/2017/04/file_example_MP4_480_1_5MG.mp4");// to use video from a url

        lookAtMe.start();
        lookAtMe.setLookMe();
    }


}