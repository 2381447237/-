package com.example.test2016_11_20;

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

	private Button btn;
	private TextView tv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);

		btn=(Button) findViewById(R.id.btn);
		btn.setOnClickListener(this);
		tv=(TextView) findViewById(R.id.tv);
		}

	@Override
	public void onClick(View v) {
		
		switch (v.getId()) {
		case R.id.btn:
			
			Intent intent=new Intent();
			intent.setClass(MainActivity.this,Activity2.class);
			startActivityForResult(intent, 1111);;
			
			break;

		default:
			break;
		}
		
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		switch (requestCode) {
		case 1111:
			
			if(resultCode==RESULT_OK){
				
				tv.setText(data.getStringExtra("data_return"));
				
			}
			
			break;

		default:
			break;
		}
	}
	
	}

