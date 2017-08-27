package com.example.test2016_11_30;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.SharedPreferences;
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

public class MainActivity extends Activity {

	private Button saveData,restoreData;
	private TextView tv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);

		tv=(TextView) findViewById(R.id.tv);
		
		saveData=(Button) findViewById(R.id.save_data);
		saveData.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				SharedPreferences.Editor editor=getSharedPreferences("data",MODE_PRIVATE).edit();
				
				editor.putString("name","Tom");
				
				editor.putInt("age",28);
				
				editor.putBoolean("married",true);
				
				editor.commit();
				
			}
		});
		
		restoreData=(Button) findViewById(R.id.restore_data);
		restoreData.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				SharedPreferences pref=getSharedPreferences("data",MODE_PRIVATE);
				String name=pref.getString("name","");
				int age=pref.getInt("age",0);
				boolean married=pref.getBoolean("married",false); 
				
				tv.setText(name+age+married);
			}
		});
	}

}
