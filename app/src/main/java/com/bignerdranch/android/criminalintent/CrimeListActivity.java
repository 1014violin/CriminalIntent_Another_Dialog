package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

/**
 Alexzandra Morris
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
