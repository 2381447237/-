package com.example.test2016_11_26;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver{

	@Override
	public void onReceive(Context context, Intent intent) {
		
		Toast.makeText(context,"����һ����׼�㲥",0).show();
		
	}

}
