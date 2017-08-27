package com.example.test2016_11_26;

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
import android.os.Build;

public class MainActivity extends Activity {

	private Button btn,btn2,btn3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);

	   btn=(Button) findViewById(R.id.btn);
	   btn.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			
			Intent intent=new Intent();
			intent.setClass(MainActivity.this,MyBroadcastReceiver.class);
			//发送标准广播
			sendBroadcast(intent);
			
		}
	});
	   btn2=(Button) findViewById(R.id.btn2);
	   btn2.setOnClickListener(new OnClickListener() {
		   
		   @Override
		   public void onClick(View v) {
			   
			   Intent intent=new Intent("MyBroadcastReceiver");
			 //发送标准广播
			   sendBroadcast(intent);
			   
		   }
	   });
	   btn3=(Button) findViewById(R.id.btn3);
	   btn3.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			Intent intent=new Intent("OrderBroadcastReceiver");
			//发送有序广播
			sendOrderedBroadcast(intent, null);
		}
	});
	}

}
