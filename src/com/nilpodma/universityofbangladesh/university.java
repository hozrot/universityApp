package com.nilpodma.universityofbangladesh;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class university extends Activity {
	Button pblc,prvt,spcl,inter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.university);
		 pblc=(Button) findViewById(R.id.button1);
		 prvt=(Button) findViewById(R.id.button2);
		 spcl=(Button) findViewById(R.id.button3);
		 inter=(Button) findViewById(R.id.button4);
		pblc.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(university.this, pblc.class);
				startActivity(intent);
			}
		});
		prvt.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(university.this,prvt.class);
				startActivity(intent);
			}
		});
		spcl.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(university.this,spcl.class);
				startActivity(intent);
			}
		});
		inter.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(university.this,inter.class);
				startActivity(intent);
			}
		});
	
	}
}
