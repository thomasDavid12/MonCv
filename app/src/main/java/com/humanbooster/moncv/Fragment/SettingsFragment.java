package com.humanbooster.moncv.Fragment;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.humanbooster.moncv.R;


/**
 * Created by hb-asus on 04/04/2017.
 */

public class SettingsFragment extends PreferenceFragment  {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.my_preferences);
    }

}
