package com.example.test2016_11_203;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends Activity implements OnClickListener{

	private Button btn2;
	private TextView tv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_2);
		
		btn2=(Button) findViewById(R.id.btn2);
		btn2.setOnClickListener(this);
		tv=(TextView) findViewById(R.id.title_tv);
		tv.setText("Activity2µÄ±êÌâ");
	}

	@Override
	public void onClick(View v) {
		
		switch (v.getId()) {
		case R.id.btn2:
			
			finish();
			
			break;

		default:
			break;
		}
		
	}

}
