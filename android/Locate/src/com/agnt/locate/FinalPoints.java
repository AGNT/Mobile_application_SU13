package com.agnt.locate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class FinalPoints extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_final_points);

		Intent mIntent = getIntent();
		int finalPoints = mIntent.getIntExtra("finalPoints", 0);

		TextView tv_finalPoints = (TextView) findViewById(R.id.tv_points);
		tv_finalPoints.setText(""+finalPoints);

	}
	
	@Override
	protected void onDestroy() {
		Toast.makeText(getBaseContext(), "Thank you for playing our game",
				Toast.LENGTH_SHORT).show();
		super.onDestroy();
	}
}
