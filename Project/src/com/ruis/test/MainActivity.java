package com.ruis.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.gst_sdk_tutorials.tutorial_5.Tutorial5;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		startActivity(new Intent(this,Tutorial5.class));
	}
}
