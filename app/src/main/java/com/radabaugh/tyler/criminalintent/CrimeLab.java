package com.radabaugh.tyler.criminalintent;

import android.content.Context;

/**
 * Created by Tyler Radabaugh on 10/17/2017.
 */

public class CrimeLab {
    private static CrimeLab sCrimeLab;

    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context) {
        
    }
}
