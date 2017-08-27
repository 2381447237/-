package com.example.test2016_11_264;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Window;
import android.view.WindowManager;

public class ForceOfflineReceiver extends BroadcastReceiver{

	@Override
	public void onReceive(final Context context, Intent intent) {
		
		AlertDialog.Builder dialogBuilder=new AlertDialog.Builder(context);
		dialogBuilder.setTitle("警告!");
		dialogBuilder.setMessage("你必须要强制下线，重新登录");
		dialogBuilder.setCancelable(false);
		dialogBuilder.setPositiveButton("好的",new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
			
				ActivityCollector.finishAll();//销毁所有activity
				Intent intent=new Intent(context,LoginActivity.class);
			    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			    context.startActivity(intent);//重新启动登录页面
				
			}
		});
		AlertDialog alertDialog=dialogBuilder.create();
		
		alertDialog.getWindow().setType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);
		alertDialog.show();
		
	}

}
