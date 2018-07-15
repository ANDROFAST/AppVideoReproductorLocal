package com.androidmorefast.moden.appreproductorvideolocal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    private VideoView mVideoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mVideoView =(VideoView)findViewById(R.id.mostrar_video);
        mVideoView.setVideoPath("/storage/external_SD/Android/dance2.mp4");
        mVideoView.setMediaController(new MediaController(this));
        mVideoView.start();
        mVideoView.requestFocus();
    }
}
