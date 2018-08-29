package com.nilpodma.universityofbangladesh;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

public class brurwv extends Activity {
	WebView brurwv;
	protected void  onCreate(Bundle savedInstanceState){
	super.onCreate(savedInstanceState);
    setContentView(R.layout.brurwv );
    Toast.makeText(getApplicationContext(),
			"Link to Official site", 10000).show() ;
    brurwv =(WebView)findViewById(R.id.webView1);
    brurwv.loadUrl("http://brur.ac.bd" );
	}

}
