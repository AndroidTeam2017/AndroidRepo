package com.example.maryam.app;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

public class CustomListView extends ArrayAdapter<String> {
    private String[] urls;
    private Bitmap[] bitmaps;
    private Activity context;

    public CustomListView(Activity context, String[] urls, Bitmap[] bitmaps) {
        super(context, R.layout.image_list_view, urls);
        this.context = context;
        this.urls= urls;
        this.bitmaps= bitmaps;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.image_list_view, null, true);
        ImageView image = (ImageView) listViewItem.findViewById(R.id.img);
        image.setImageBitmap(Bitmap.createScaledBitmap(bitmaps[position],100,50,false));
        return  listViewItem;
    }
}
