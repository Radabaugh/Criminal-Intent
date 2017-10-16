package com.radabaugh.tyler.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Tyler Radabaugh on 10/16/2017.
 */

public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

}
