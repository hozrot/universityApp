package com.nilpodma.universityofbangladesh;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

public class dhawv extends Activity {
	WebView dhawv;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dhawv);
		Toast.makeText(getApplicationContext(), "Link to Official site", 10000)
				.show();
		dhawv = (WebView) findViewById(R.id.webView1);
		dhawv.loadUrl("http://du.ac.bd");
	}

}
