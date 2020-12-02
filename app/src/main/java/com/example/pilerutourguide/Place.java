package com.example.pilerutourguide;

public class Place {
    String name;
    String address;
    int imageId;
    Place(String s,String a,int i)
    {
        name=s;
        address=a;
        imageId=i;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }

    public String getAddress() {
        return address;
    }
}
