package com.radabaugh.tyler.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Tyler Radabaugh on 10/17/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_masterdetail;
    }
}
