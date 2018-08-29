package com.nilpodma.universityofbangladesh;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class devision extends Activity {
	Button bari, chit, dha, khul, raj, ran, syl;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.division);
		bari = (Button) findViewById(R.id.button1);
		chit = (Button) findViewById(R.id.button2);
		dha = (Button) findViewById(R.id.button3);
		khul = (Button) findViewById(R.id.button4);
		raj = (Button) findViewById(R.id.button5);
		ran = (Button) findViewById(R.id.button6);
		syl = (Button) findViewById(R.id.button7);
		
		bari.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(devision.this, bari.class);
				startActivity(intent);
			}
		});
		chit.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(devision.this, chit.class);
				startActivity(intent);
			}
		});
		dha.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(devision.this, dha.class);
				startActivity(intent);
			}
		});
		khul.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(devision.this, khul.class);
				startActivity(intent);
			}
		});
		raj.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent( devision.this, raj.class);
				startActivity(intent);
			}
		});
		ran.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(devision.this, ran.class);
				startActivity(intent);
			}
		});
		syl.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(devision.this, syl.class);
				startActivity(intent);
			}
		});
		 
	}
}
