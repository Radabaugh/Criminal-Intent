package com.radabaugh.tyler.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by Tyler Radabaugh on 10/16/2017.
 */

public class CrimeFragment extends Fragment {
    private Crime mCrime;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCrime = new Crime();
    }
}
