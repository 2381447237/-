package com.example.test2016_11_203;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.os.Build;

public class MainActivity extends Activity implements OnClickListener{

	private Button btn1;
	private TextView tv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		
		btn1=(Button) findViewById(R.id.btn1);
		btn1.setOnClickListener(this);
		tv=(TextView) findViewById(R.id.title_tv);
		tv.setText("Activity1µÄ±êÌâ");
	}

	@Override
	public void onClick(View v) {
		
		switch (v.getId()) {
		case R.id.btn1:
			
			Intent intent=new Intent();
			intent.setClass(this, Activity2.class);
			startActivity(intent);
			
			break;

		default:
			break;
		}
		
	}

}
