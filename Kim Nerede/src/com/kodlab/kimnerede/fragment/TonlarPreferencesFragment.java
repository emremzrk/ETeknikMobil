package com.kodlab.kimnerede.fragment;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import com.kodlab.kimnerede.R;

public class TonlarPreferencesFragment extends PreferenceFragment {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.tonlar_preferences);
	}

}