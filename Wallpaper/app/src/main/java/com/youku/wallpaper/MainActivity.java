package com.youku.wallpaper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.youku.magic_wallpaper.MagicWallpaperActivity;
import com.youku.transparent_wallpaper.WallPaperActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initfindById();
    }

    private void initfindById(){
        findViewById(R.id.trans).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, WallPaperActivity.class));
            }
        });
        findViewById(R.id.magic).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MagicWallpaperActivity.class));
            }
        });
    }
}
