package com.android.udacity.tour_app_abnd7.Adapters;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.android.udacity.tour_app_abnd7.Fragments.HotelFragment;
import com.android.udacity.tour_app_abnd7.Fragments.PlacesFragment;
import com.android.udacity.tour_app_abnd7.Fragments.RestaurantFragment;
import com.android.udacity.tour_app_abnd7.Fragments.UtilityFragment;

public class CategoryViewPagerAdapter extends FragmentPagerAdapter {
    public CategoryViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        if (i == 0) {
            return new RestaurantFragment();

        } else if (i == 1) {
            return new PlacesFragment();
        } else if (i == 2) {
            return new HotelFragment();
        } else {
            return new UtilityFragment();
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
            return "Restaurants";
        } else if (position == 1) {
            return "Places";
        } else if (position == 2) {
            return "Hotels";
        } else {
            return "Utilities";
        }
    }
}
