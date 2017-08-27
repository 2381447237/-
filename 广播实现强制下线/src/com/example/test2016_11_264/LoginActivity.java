package com.example.test2016_11_264;

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
import android.widget.EditText;
import android.os.Build;

public class LoginActivity extends BaseActivity {

	private EditText accountEt,passwordEt;
	private Button loginBtn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_login);

		accountEt=(EditText) findViewById(R.id.account_et);
		passwordEt=(EditText) findViewById(R.id.password_et);
		
		loginBtn=(Button) findViewById(R.id.login_btn);
		loginBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent intent=new Intent(LoginActivity.this,MainActivity.class);
				startActivity(intent);
			}
		});
	}

}
