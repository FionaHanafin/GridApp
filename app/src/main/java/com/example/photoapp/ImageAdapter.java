package com.example.photoapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    // Constructor
    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {return 0; }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(final int position, final View convertView, ViewGroup parent) {
        ImageView imageView;

        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(200, 200));

            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        }
        else{
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(mThumbIds[position]);
        imageView.setContentDescription(String.valueOf(position));
        imageView.setOnClickListener(new View.OnClickListener() {
         @Override

         public void onClick(View v) {
             Log.d("****** xx",String.valueOf(position));
             Intent intent = new Intent(mContext,PhotoActivity.class);
            intent.putExtra("cd",String.valueOf(position));
            mContext.startActivity(intent);
         }
        }
        );
        return imageView;
    }
    static public Integer getImage(int p) {
        return mThumbIds[p];
    }
    // Keep all Images in array
    static public Integer[] mThumbIds = {
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
            R.drawable.fox};
}