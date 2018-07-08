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
        } else if (position == 1 ) {
            return new FoodDrinkFragment();
        } else if (position == 2) {
            return new HotelsFragment();
        } else {
            return new ShoppingFragment();
        }
    }


    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_spots_places);
        } else if (position == 1) {
            return mContext.getString(R.string.category_food_drink);
        } else if (position == 2) {
            return mContext.getString(R.string.category_hotels);
        } else {
            return mContext.getString(R.string.category_shopping);
        }
    }
}
