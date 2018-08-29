package com.nilpodma.universityofbangladesh;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class info extends Activity {
	TextView tv1,tv2;
	protected void  onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
	    setContentView(R.layout.info );
	    Toast.makeText(getApplicationContext(), "contacts", 10000)
		.show();
	    tv1=(TextView) findViewById(R.id.textView1);
	    tv2=(TextView) findViewById(R.id.textView2);
	}

}
