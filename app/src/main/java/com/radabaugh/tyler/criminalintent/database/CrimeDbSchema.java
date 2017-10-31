package com.radabaugh.tyler.criminalintent.database;

/**
 * Created by Tyler Radabaugh on 10/31/2017.
 */

public class CrimeDbSchema {
    public static final class CrimeTable {
        public static final String NAME = "crimes";

        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVED = "solved"
        }
    }
}
