package com.kodlab.kimnerede.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.kodlab.kimnerede.R;
import com.kodlab.kimnerede.db.Profil;

public class KimlerListAdapter extends ArrayAdapter<Profil> {

	private List<Profil> arkadasList;
	private Context context;
	private int layoutResourceId;
	
	public KimlerListAdapter(Context context, int layoutResourceId, List<Profil> arkadasList) {
		super(context, layoutResourceId, arkadasList);
		this.context = context;
		this.layoutResourceId = layoutResourceId;
		this.arkadasList = arkadasList;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		View view = convertView;
		
		if(view == null) {
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			view = inflater.inflate(layoutResourceId, null);
		}
		
		Profil profil = arkadasList.get(position);
		
		TextView kimlerListKullaniciAdiTextView = (TextView) view.findViewById(R.id.kimlerListKullaniciAdiTextView);
		TextView kimlerListAdSoyadTextView = (TextView) view.findViewById(R.id.kimlerListAdSoyadTextView);
		
		kimlerListKullaniciAdiTextView.setText(profil.getKullaniciAdi());
		kimlerListAdSoyadTextView.setText(profil.getAd() + " " + profil.getSoyad());

		return view;
	}

}
