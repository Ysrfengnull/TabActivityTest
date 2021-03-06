package com.android.tabactivity;


import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;

public final class PreferencesActivity3 extends PreferenceActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.settings3);
		Resources res = getResources();		
		IconPreferenceScreen notify = (IconPreferenceScreen) findPreference("Notifications");
		IconPreferenceScreen app = (IconPreferenceScreen) findPreference("Application");
		
		Drawable notifyIcon = res.getDrawable(R.drawable.ic_setting_notify);
		Drawable appIcon = res.getDrawable(R.drawable.ic_setting_app);
		
		notify.setIcon(notifyIcon);
		app.setIcon(appIcon);
	
		app.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
			@Override
			public boolean onPreferenceClick(Preference preference) {
				startActivity(new Intent(PreferencesActivity3.this, OneActivity.class));
				return true;
			}
		});
		notify.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
			@Override
			public boolean onPreferenceClick(Preference preference) {
				startActivity(new Intent(PreferencesActivity3.this, PreferencesActivity2.class));
				return true;
			}
		});
	}
}
