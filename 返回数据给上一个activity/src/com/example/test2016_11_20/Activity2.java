package com.example.test2016_11_20;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class Activity2 extends Activity implements OnClickListener{

	private Button btn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_2);
		
		btn=(Button) findViewById(R.id.btn2);
		btn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		
		switch (v.getId()) {
		case R.id.btn2:
			
			Intent intent=new Intent();
			intent.putExtra("data_return","我是上个界面返回回来的值");
			setResult(RESULT_OK, intent);
			finish();
			break;

		default:
			break;
		}
		
	}

}
