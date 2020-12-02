package com.example.pilerutourguide;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;
import java.util.zip.Inflater;

public class CustomAdapter extends ArrayAdapter<Place> {
    public CustomAdapter(@NonNull Context context, int resource, @NonNull List<Place> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view= LayoutInflater.from(getContext()).inflate(R.layout.placelayout,parent,false);
        Place ob=getItem(position);
        ImageView imageView=view.findViewById(R.id.image1);
        imageView.setImageResource(ob.imageId);
        LinearLayout ll=view.findViewById(R.id.ll2);
        TextView tv1=ll.findViewById(R.id.tv1);
        tv1.setText(ob.name);
        TextView tv2=ll.findViewById(R.id.tv2);
        tv2.setText(ob.address);
        return view;
    }

}
