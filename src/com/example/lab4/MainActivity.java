package com.example.lab4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		
	}
	public void ClickTombol(View v){
		Intent x = new Intent(MainActivity.this, ActivityAbout.class);
		startActivity(x);
	}

	

}
