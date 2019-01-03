package com.example.activity.lifetime;

import com.example.activitylifetime.R;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends Activity{
	private static final String TAG = SecondActivity.class.getSimpleName();
	
	//intent
	private static final String INTENT_TYPE = "show_type";
	public static final int FULLSCREEN_NO_Translucent = 1;
	public static final int FULLSCREEN_Translucent = 2;
	public static final int NO_FULLSCREEN_NO_Translucent = 3;
	public static final int NO_FULLSCREEN_Translucent = 4;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Log.e(TAG, "onCreate");
		TextView textView = new TextView(this);
		textView.setText("Ìø×ªºóµÄActivity");
		textView.setBackgroundColor(Color.WHITE);
		int type = getIntent().getIntExtra(INTENT_TYPE, 0);
//		if(FULLSCREEN_NO_Translucent == type){
//			setTheme(R.style.fullScreen_No_Translucent_Style);
//		}else if(FULLSCREEN_Translucent == type){
//			setTheme(R.style.fullScreen_Translucent_Theme);
//		}else if(NO_FULLSCREEN_NO_Translucent == type){
//			setTheme(R.style.noFullScreen_No_Translucent_Theme);
//		}else if(NO_FULLSCREEN_Translucent == type){
//			setTheme(R.style.noFullScreen_Translucent_Theme);
//		}
		setContentView(textView);
	}
	
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		Log.e(TAG, "onBackPressed");
	}
	
	
	public static void startActivitySelf(Activity activity, int type){
		Intent intent = new Intent(activity, SecondActivity.class);
		intent.putExtra(INTENT_TYPE, type);
		activity.startActivity(intent);
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
