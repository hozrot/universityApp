package com.nilpodma.universityofbangladesh;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

public class otherwv extends Activity {
	WebView otherwv;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.otherwv);
		Toast.makeText(getApplicationContext(),
				"Link to University list of wiki", 10000).show();
		otherwv = (WebView) findViewById(R.id.webView1);
		otherwv.loadUrl("http://en.wikipedia.org/wiki/List_of_universities_in_Bangladesh");
	}

}
