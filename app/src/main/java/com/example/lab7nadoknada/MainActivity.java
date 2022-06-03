package com.example.lab7nadoknada;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.provider.MediaStore;
import android.widget.VideoView;
import android.widget.MediaController;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //resFolderVideo();
        internetVideo();
    }

    public void resFolderVideo() {
        VideoView videoView = (VideoView) findViewById(R.id.videoView);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);

        Uri uri = Uri.parse("android.resource://"+ getPackageName()+ "/" + R.raw.house);

        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.start();
    }

    public void internetVideo() {
        VideoView videoView = (VideoView) findViewById(R.id.videoView);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);

        Uri uri = Uri.parse("https://loginportal.funnyjunk.com/hdgifs/Pricier+narwhal_1146f9_9612776.mp4");

        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.start();
    }

}