package com.kodlab.kimnerede.fragment;

import com.kodlab.kimnerede.R;
import android.os.Bundle;
import android.preference.PreferenceFragment;

public class UyarilarPreferencesFragment extends PreferenceFragment {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.uyarilar_preferences);
	}

}