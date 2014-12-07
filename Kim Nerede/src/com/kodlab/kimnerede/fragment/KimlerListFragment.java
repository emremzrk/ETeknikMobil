package com.kodlab.kimnerede.fragment;

import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
/*
import com.kodlab.kimnerede.HaritaActivity;
*/
import com.kodlab.kimnerede.R;
import com.kodlab.kimnerede.background.ArkadasSorgulaAsyncTask;

public class KimlerListFragment extends ListFragment {
/*
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		
		super.onActivityCreated(savedInstanceState);
		
		ListView arkadasListView = getListView();
		
		arkadasListView.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView arg0, View view, int position, long id) {
				RelativeLayout layout = (RelativeLayout) view;
				TextView kimlerListKullaniciAdiTextView = (TextView) layout.findViewById(R.id.kimlerListKullaniciAdiTextView);
				
				Intent intent = new Intent(getActivity(), HaritaActivity.class);
				intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				intent.putExtra(HaritaActivity.ARKADAS_INTENT_EXTRA, kimlerListKullaniciAdiTextView.getText());
				startActivity(intent);
			}
        });
		
		setListShown(true);
		
		ArkadasSorgulaAsyncTask task = new ArkadasSorgulaAsyncTask(getActivity(), this);
		task.execute();
		
		arkadasListView.setDividerHeight(5);
		
	}*/
	
}
