package com.agnt.locate;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;

public class Menu extends Activity {
	private static final String GooglePlayStorePackageNameOld = "com.google.market";
	private static final String GooglePlayStorePackageNameNew = "com.google.vending";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);

		isGooglePlayServicesInstalled();

		if (!isNetworkAvailable()) {
			AlertDialog.Builder alertDialog = new AlertDialog.Builder(Menu.this);
			alertDialog.setTitle("No Internet Connectivity");
			alertDialog
					.setMessage("Please note that this application will not work without an active internet connection\n\n\nConnect to WiFi or 3G network and then continue!");
			alertDialog.setNeutralButton("OK", null);
			alertDialog.show();
		}

		Button play = (Button) findViewById(R.id.button1);
		Button about = (Button) findViewById(R.id.button2);
		Button help = (Button) findViewById(R.id.button3);

		play.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i1 = new Intent(getBaseContext(), MainActivity.class);
				startActivity(i1);
			}
		});

		help.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i2 = new Intent(getBaseContext(), Help.class);
				startActivity(i2);
			}
		});

		about.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i3 = new Intent(getBaseContext(), About.class);
				startActivity(i3);
			}
		});
	}

	private boolean isNetworkAvailable() {
		ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo activeNetworkInfo = connectivityManager
				.getActiveNetworkInfo();
		return activeNetworkInfo != null;
	}

	private boolean isGooglePlayServicesInstalled() {
		int status = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this);
		if (status != ConnectionResult.SUCCESS) {
			Toast.makeText(this, "This device is not supported.\nGoogle Play Services is required to run this app!",
					Toast.LENGTH_LONG).show();
			finish();
			return false;
		}
		return true;
	}
}
