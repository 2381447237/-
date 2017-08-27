package com.example.test2016_11_263;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
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

   private Button btn;	

   private IntentFilter intentFilter;
   
   private LocalBroadcastReceiver lReceiver;
   
   private LocalBroadcastManager lManager;
   
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);

		lManager=LocalBroadcastManager.getInstance(this);//获得实例
		
		btn=(Button) findViewById(R.id.btn);
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent intent=new Intent("LocalBroadcastReceiver");
				lManager.sendBroadcast(intent);//发送本地广播
			}
		});
		intentFilter=new IntentFilter();
		intentFilter.addAction("LocalBroadcastReceiver");
		lReceiver=new LocalBroadcastReceiver();
		lManager.registerReceiver(lReceiver, intentFilter);//注册本地广播
	}

	@Override
		protected void onDestroy() {
			super.onDestroy();
			lManager.unregisterReceiver(lReceiver);
		}
	
}
