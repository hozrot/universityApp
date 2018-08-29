package com.nilpodma.universityofbangladesh;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	TextView tv1;
	Button university, devision, extra, info;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Toast.makeText(getApplicationContext(), "WelCome To my Apps", 10000)
				.show();
		tv1 = (TextView) findViewById(R.id.textView1);
		university = (Button) findViewById(R.id.button1);
		devision = (Button) findViewById(R.id.button2);
		extra = (Button) findViewById(R.id.button3);
		info = (Button) findViewById(R.id.button4);
		university.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(MainActivity.this, university.class);
				startActivity(intent);
			}
		});
		devision.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(MainActivity.this, devision.class);
				startActivity(intent);
			}
		});
		extra.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(MainActivity.this, extra.class);
				startActivity(intent);
			}
		});
		info.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(MainActivity.this, info.class);
				startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
