package com.example.test2016_11_26;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class OrderBroadcastReceiver extends BroadcastReceiver{

	@Override
	public void onReceive(Context context, Intent intent) {
		
		Toast.makeText(context,"发送一个有序广播",0).show();
		//将这条广播截断，后面的广播接收者将无法接收到这条广播
		abortBroadcast();
	}

}
