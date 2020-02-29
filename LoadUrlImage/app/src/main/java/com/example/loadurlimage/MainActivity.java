package com.example.loadurlimage;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);

        Picasso.with(this).load("https://upload.wikimedia.org/wikipedia/id/thumb/2/23/Inter_Milan.png/200px-Inter_Milan.png").into(imageView);
    }
}
