//07-05-2020 10117191-RizalMaulana-IF5
package com.apps.rizalmaulana.splashscreen;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPageAdapter extends FragmentPagerAdapter {

    private final List<Fragment> listFragment = new ArrayList<>();
    private final List<String> listVitles = new ArrayList<>();


    public ViewPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return listFragment.get(position);
    }

    @Override
    public int getCount() {
        return listVitles.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return listVitles.get(position);
    }


    public void AddFragment (Fragment fragment, String tittle) {
        listFragment.add(fragment);
        listVitles.add(tittle);
    }
}
