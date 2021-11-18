package com.simplifiededtech.customtablayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {
    public FragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {

            case 1:
                return new Demo2Fragment();
            case 2:
                return new Demo3Fragment();

            default:
                return new Demo1Fragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0) {
            title = "Demo1";
        } else if (position == 1) {
            title = "Demo2";
        } else {
            title = "Demo3";
        }

        return title;
    }
}
