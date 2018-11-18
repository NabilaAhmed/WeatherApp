package com.example.android.weatherforcasting.Adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nabila on 18/11/2018.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    List<Fragment> fragments = new ArrayList<>();
    List<String> fragmantTitle = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    public void addFragment(Fragment fragment, String fraTitle) {
        fragments.add(fragment);
        fragmantTitle.add(fraTitle);

    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmantTitle.get(position);
    }
}
