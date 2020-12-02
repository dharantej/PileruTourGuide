package com.example.pilerutourguide;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class Fadapter extends FragmentPagerAdapter {
    public Fadapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new Temples();
            case 1:
                return new Theaters();
            case 2:
                return new Restaurants();
            case 3:
                return new PublicPlaces();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            case 0:
                return "Temples";
            case 1:
                return "Theaters";
            case 2:
                return "Restaurants";
            case 3:
                return "PublicPlaces";
        }
        return null;
    }
}
