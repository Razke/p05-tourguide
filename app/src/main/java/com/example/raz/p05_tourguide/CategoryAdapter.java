package com.example.raz.p05_tourguide;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;


    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }


    public Fragment getItem(int position) {
        if (position == 0) {
            return new SpotsPlacesFragment();
        } else {
            return new SpotsPlacesFragment();
        }
    }


    @Override
    public int getCount() {
        return 1;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_spots_places);
        } else {
            return mContext.getString(R.string.category_spots_places);
        }
    }
}
