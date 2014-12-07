package com.kodlab.kimnerede.fragment;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import com.kodlab.kimnerede.R;

public class GizlilikPreferencesFragment extends PreferenceFragment {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.gizlilik_preferences);
	}

}