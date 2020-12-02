package com.example.pilerutourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class Temples extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view=inflater.inflate(R.layout.listlayout,container,false);
        ListView lv=view.findViewById(R.id.listview);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Place ob=(Place)parent.getItemAtPosition(position);
                String address="517214 Pileru "+ob.getName()+" ";
                address="http://maps.google.co.in/maps?q="+address;
                Uri gmmIntentUri = Uri.parse(address);

// Create an Intent from gmmIntentUri. Set the action to ACTION_VIEW
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
// Make the Intent explicit by setting the Google Maps package
                mapIntent.setPackage("com.google.android.apps.maps");

// Attempt to start an activity that can handle the Intent
                startActivity(mapIntent);
            }
        });
        ArrayList<Place>al=new ArrayList<>();
        al.add(new Place("Sree Venkateswara Swamy Temple","Kotapalli,Roja plots",R.drawable.kottapallitemple));
        al.add(new Place("SaiBaba Temple","Madanapalle Road,opp to Raja Sahab Hospital",R.drawable.saibabatemple));
        CustomAdapter ca=new CustomAdapter(getContext(),R.layout.placelayout,al);
        lv.setAdapter(ca);
        return view;
    }
}
