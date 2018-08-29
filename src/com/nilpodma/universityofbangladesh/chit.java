package com.nilpodma.universityofbangladesh;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class chit extends Activity {
	TextView tv1;
	protected void  onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
	    setContentView(R.layout.chit );
	    tv1=(TextView) findViewById(R.id.textView1);

}

}
