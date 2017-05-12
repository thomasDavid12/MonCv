package com.humanbooster.moncv.Activity;

import android.app.Fragment;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;

import com.humanbooster.moncv.Fragment.SettingsFragment;
import com.humanbooster.moncv.R;



public class SettingsActivity extends AppCompatActivity {

    private boolean seeSharedPreferences() {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        return prefs.getBoolean("pref_key", false);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);

        if (seeSharedPreferences()) {
            setTheme(R.style.FeedActivityThemeDark);
        } else {
            setTheme(R.style.FeedActivityThemeLight);
        }

        setContentView(R.layout.settings_fragment);
        super.onCreate(savedInstanceState);
        setFragment(new SettingsFragment());
    }

    private void setFragment(Fragment frag) {
        getFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, frag).commit();
    }
}
