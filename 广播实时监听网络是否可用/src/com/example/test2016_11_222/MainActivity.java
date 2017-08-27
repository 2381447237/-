package com.example.test2016_11_222;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Toast;
import android.os.Build;

public class MainActivity extends Activity {

	private IntentFilter intentFilter;
	
	private NetworkChangeReceiver networkChangeReceiver;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);

		intentFilter=new IntentFilter();
		intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
		networkChangeReceiver=new NetworkChangeReceiver();
		registerReceiver(networkChangeReceiver, intentFilter);
	
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		unregisterReceiver(networkChangeReceiver);
	}
	
	class NetworkChangeReceiver extends BroadcastReceiver{

		@Override
		public void onReceive(Context context, Intent intent) {
		ConnectivityManager cManager=(ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
			
		NetworkInfo networkInfo=cManager.getActiveNetworkInfo();
		
		if(networkInfo!=null&&networkInfo.isAvailable()){
			Toast.makeText(context,"网络可用",0).show();
		}else{
			Toast.makeText(context,"网络不可用",0).show();
		}
		}
		
	}
	
}
