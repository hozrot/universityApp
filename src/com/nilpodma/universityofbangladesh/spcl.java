package com.nilpodma.universityofbangladesh;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class spcl extends Activity {
	TextView tv1;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.spcl);
		Toast.makeText(getApplicationContext(),
				"There are two Special university", 10000).show();
		tv1 = (TextView) findViewById(R.id.textView1);

	}
}
