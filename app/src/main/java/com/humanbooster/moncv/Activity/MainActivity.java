package com.humanbooster.moncv.Activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.humanbooster.moncv.Fragment.CompetencesFragment;
import com.humanbooster.moncv.Fragment.ExperiencesFragment;
import com.humanbooster.moncv.Fragment.FormationsFragment;
import com.humanbooster.moncv.R;


public class MainActivity extends AppCompatActivity {

    private SharedPreferences.OnSharedPreferenceChangeListener listener;

    /*test */
    private boolean seeSharedPreferences() {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        return prefs.getBoolean("pref_key", false);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        /* récupération des préférences */
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);

        /* initialisation du theme */
        if (seeSharedPreferences()) {
            setTheme(R.style.FeedActivityThemeDark);
        } else {
            setTheme(R.style.FeedActivityThemeLight);
        }

        /* Instance de l'écouteur */
        listener = new SharedPreferences.OnSharedPreferenceChangeListener() {
            public void onSharedPreferenceChanged(SharedPreferences pref, String key) {
                if (seeSharedPreferences()) {
                    setTheme(R.style.FeedActivityThemeDark);
                    Intent intent = new Intent(MainActivity.this, MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                } else {
                    setTheme(R.style.FeedActivityThemeLight);
                    Intent intent = new Intent(MainActivity.this, MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                }
            }
        };

        /* Enregistrement des pref */
        pref.registerOnSharedPreferenceChangeListener(listener);

        /* Choix de la vue */
        setContentView(R.layout.activity_main);

        /* Choix du fragment */
        setFragment(new ExperiencesFragment());

        /* Barre de navigation */
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        /* SUPER */
        super.onCreate(savedInstanceState);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);

    }

    private void setFragment(Fragment frag) {
        getFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, frag).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.competences_dashboard:
                    setFragment(new CompetencesFragment());
                    return true;
/*                case R.id.profil_dashboard:
                    setFragment(new MainFragments());
                    return true;*/
                case R.id.experiences_dashboard:
                    setFragment(new ExperiencesFragment());
                    return true;
                case R.id.formations_dashboard:
                    setFragment(new FormationsFragment());
                    return true;
            }
            return false;
        }

    };
}
