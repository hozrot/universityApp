package com.nilpodma.universityofbangladesh;

 

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class pblc extends Activity {
	
	Button dha,raj,brur,other;
	
protected void  onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
	     setContentView(R.layout.pblc);
	     Toast.makeText(getApplicationContext(),
					"There are thirty-two public university", 10000).show() ;
	    
	     dha=(Button)findViewById(R.id.button1);
	     raj =(Button) findViewById(R.id.button2);
	     brur=(Button) findViewById(R.id.button3);
	     other=(Button)findViewById(R.id.button4);
	     
	     dha.setOnClickListener(new View.OnClickListener() {

	    	 @Override
				public void onClick(View arg0) {
					Intent intent = new Intent(pblc.this, dhawv.class);
					startActivity(intent);

				}
			});
	     raj.setOnClickListener(new View.OnClickListener() {

	    	 @Override
				public void onClick(View arg0) {
					Intent intent = new Intent(pblc.this, rajwv.class);
					startActivity(intent);

				}
			});
	     brur.setOnClickListener(new View.OnClickListener() {

	    	 @Override
				public void onClick(View arg0) {
					Intent intent = new Intent(pblc.this, brurwv.class);
					startActivity(intent);

				}
			});
	     other.setOnClickListener(new View.OnClickListener() {

	    	 @Override
				public void onClick(View arg0) {
					Intent intent = new Intent(pblc.this, otherwv.class);
					startActivity(intent);

				}
			});
	}

}
