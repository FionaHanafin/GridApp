package com.example.photoapp;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class PhotoActivity extends AppCompatActivity {
Bundle b;
ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);
        b= getIntent().getExtras();
        String str = b.getString("cd");
        if(str!=null){
            Log.d("******cd ",str);
        }
        img = findViewById(R.id.image);
        img.setContentDescription(str);
        img.setImageResource(ImageAdapter.getImage(Integer.parseInt(str)));
    }
    public void onClick(View v){
        int imgNo = Integer.parseInt(img.getContentDescription().toString());
        Log.d("******* v ", "in onclick");
        Log.d("******* imgNo **", String.valueOf(imgNo));
        switch (v.getId()){
            case R.id.pre:
                Log.d("******* case pre ", "");
                if (imgNo>0) {
                    img.setContentDescription(String.valueOf(imgNo-1));
                    Log.d("******* imgNo pre if ", String.valueOf(imgNo-1));
                    img.setImageResource(imgs[imgNo-1]);
                }else if(imgNo==0){
                    img.setContentDescription(String.valueOf(imgs.length- 1));
                    Log.d("******* imgNo pre else", String.valueOf(imgs.length- 1));
                    img.setImageResource(imgs[imgs.length-1]);
                }
                break;
            case R.id.next:
                Log.d("******* case next", "");
                if (imgNo<imgs.length-1) {
                    img.setContentDescription(String.valueOf(imgNo+ 1));
                    Log.d("******* imgNo next if", String.valueOf(imgNo+1));
                    img.setImageResource(imgs[imgNo+ 1]);
                }else if(imgNo==imgs.length-1){
                    img.setContentDescription("0");
                    Log.d("******* imgNo next else", String.valueOf(0));
                    img.setImageResource(imgs[0]);
                }
                break;
        }
    }
    static public Integer[] imgs = {
            R.drawable.bird,
            R.drawable.minion,
            R.drawable.panda_shark,
            R.drawable.pupper,
            R.drawable.spongebob,
            R.drawable.website,
            R.drawable.large,
            R.drawable.imag1,
            R.drawable.chocolate,
            R.drawable.cute,
            R.drawable.lab,
            R.drawable.fox,
            R.drawable.bird,
            R.drawable.minion,
            R.drawable.panda_shark,
            R.drawable.pupper,
            R.drawable.spongebob,
            R.drawable.website,
            R.drawable.large,
            R.drawable.imag1,
            R.drawable.chocolate,
            R.drawable.cute,
            R.drawable.lab,
            R.drawable.fox,
            R.drawable.bird,
            R.drawable.minion,
            R.drawable.panda_shark,
            R.drawable.pupper,
            R.drawable.spongebob,
            R.drawable.website,
            R.drawable.large,
            R.drawable.imag1,
            R.drawable.chocolate,
            R.drawable.cute,
            R.drawable.lab,
            R.drawable.fox
    };
}
