package com.kodlab.kimnerede;

import android.app.Activity;

public class BaseActivity extends Activity {
	
	public static final String PROFILE_PHOTO_FILE_NAME = "ProfilFotografim.jpg";
	
	public static final String KIM_NEREDE_BASE_URL = "http://10.0.2.2/kimnerede/";
	public static final String KIM_NEREDE_PROFIL_KAYDET_URL = KIM_NEREDE_BASE_URL + "profil_kaydet.php";
	public static final String KIM_NEREDE_ARKADAS_LISTELE_URL = KIM_NEREDE_BASE_URL + "arkadas_listele.php";
	public static final String KIM_NEREDE_ARKADAS_EKLE_URL = KIM_NEREDE_BASE_URL + "arkadas_ekle.php";
	public static final String KIM_NEREDE_KONUM_SORGULA_URL = KIM_NEREDE_BASE_URL + "konum_sorgula.php";
	public static final String KIM_NEREDE_KONUM_KAYDET_URL = KIM_NEREDE_BASE_URL + "konum_kaydet.php";
	
}
