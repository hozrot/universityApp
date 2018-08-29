package com.nilpodma.universityofbangladesh;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

public class rajwv extends Activity {
	WebView rajwv;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.rajwv);
		Toast.makeText(getApplicationContext(), "Link to Official site", 10000)
				.show();
		rajwv = (WebView) findViewById(R.id.webView1);
		rajwv.loadUrl("http://ru.ac.bd");
	}

}
