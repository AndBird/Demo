package com.example.activity.lifetime;

import com.example.activitylifetime.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity{
	private static final String TAG = MainActivity.class.getSimpleName();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Log.e(TAG, "onCreate");
		setContentView(R.layout.activity_main);
		initView();
	}
	
	private void initView(){
		try {
			findViewById(R.id.button1).setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Log.e(TAG, "click jump");
					SecondActivity.startActivitySelf(MainActivity.this, SecondActivity.NO_FULLSCREEN_Translucent);
				}
			});
			
			
			findViewById(R.id.button2).setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Log.e(TAG, "click jump");
					SecondActivity.startActivitySelf(MainActivity.this, SecondActivity.NO_FULLSCREEN_Translucent);
					MainActivity.this.finish();
				}
			});
			
			findViewById(R.id.button3).setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Log.e(TAG, "click jump");
					SecondActivity.startActivitySelf(MainActivity.this, SecondActivity.NO_FULLSCREEN_NO_Translucent);
				}
			});
			
			
			findViewById(R.id.button4).setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Log.e(TAG, "click jump");
					SecondActivity.startActivitySelf(MainActivity.this, SecondActivity.NO_FULLSCREEN_NO_Translucent);
					MainActivity.this.finish();
				}
			});
			
			findViewById(R.id.button5).setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Log.e(TAG, "click jump");
					SecondActivity.startActivitySelf(MainActivity.this, SecondActivity.FULLSCREEN_Translucent);
				}
			});
			
			
			findViewById(R.id.button6).setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Log.e(TAG, "click jump");
					SecondActivity.startActivitySelf(MainActivity.this, SecondActivity.FULLSCREEN_Translucent);
					MainActivity.this.finish();
				}
			});
			
			
			findViewById(R.id.button7).setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Log.e(TAG, "click jump");
					SecondActivity.startActivitySelf(MainActivity.this, SecondActivity.FULLSCREEN_NO_Translucent);
				}
			});
			
			
			findViewById(R.id.button8).setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Log.e(TAG, "click jump");
					SecondActivity.startActivitySelf(MainActivity.this, SecondActivity.FULLSCREEN_NO_Translucent);
					MainActivity.this.finish();
				}
			});
			
			
			
			findViewById(R.id.button9).setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Log.e(TAG, "click jump");
					DialogActivity.startActivitySelf(MainActivity.this, 0);
				}
			});
			
			
			findViewById(R.id.button10).setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Log.e(TAG, "click jump");
					DialogActivity.startActivitySelf(MainActivity.this, 0);
					MainActivity.this.finish();
				}
			});
			
			
			findViewById(R.id.button11).setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Log.e(TAG, "click show dialog");
					AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
					alertDialog.setButton("确定", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface dialog, int which) {
							// TODO Auto-generated method stub
							
						}
					});
					alertDialog.setMessage("测试对话框对Activity生命周期的影响");
					alertDialog.show();
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.e(TAG, "onRestart");
	}
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.e(TAG, "onStart");
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.e(TAG, "onResume");
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.e(TAG, "onPause");
	}
	
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.e(TAG, "onStop");
	}
	
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.e(TAG, "onDestroy");
	}
	
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		// TODO Auto-generated method stub
		super.onSaveInstanceState(outState);
		Log.e(TAG, "onSaveInstanceState");
	}
	
	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onRestoreInstanceState(savedInstanceState);
		Log.e(TAG, "onRestoreInstanceState");
	}

}
