package com.nilpodma.universityofbangladesh;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class syl extends Activity {
	TextView tv1;
	protected void  onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
	    setContentView(R.layout.syl );
	    tv1=(TextView) findViewById(R.id.textView1);
	}

}
