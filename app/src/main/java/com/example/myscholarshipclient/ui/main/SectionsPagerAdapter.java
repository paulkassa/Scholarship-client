package com.example.myscholarshipclient.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.myscholarshipclient.R;
import com.example.myscholarshipclient.internship_frag;
import com.example.myscholarshipclient.masters_frag;
import com.example.myscholarshipclient.phd_frag;
import com.example.myscholarshipclient.under_graduate_frag;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.internship, R.string.undergrad, R.string.masters, R.string.phd};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position)
        {
            case 0:
                fragment = new internship_frag();
                break;
            case 1:
                fragment = new under_graduate_frag();
                break;
            case 2:
                fragment = new masters_frag();
                break;
            case 3:
                fragment = new phd_frag();
                break;
        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 4;
    }
}