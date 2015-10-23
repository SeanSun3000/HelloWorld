package com.example.helloworld;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener
{
	public static final String TAG = "hello";
	private Button mBtn;
	private int i = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.d(TAG, "onCreate()");

		initViews();
	}

	private void initViews()
	{
		mBtn = (Button) findViewById(R.id.main_btn1);
		mBtn.setOnClickListener(this);

		FragmentManager fm = getFragmentManager();
		if (fm.findFragmentById(R.id.main_fragmentContainer) == null) {
			Fragment fg1 = new Fragment1();
			fm.beginTransaction().add(R.id.main_fragmentContainer, fg1)
					.commit();
		}
	}

	@Override
	protected void onRestart()
	{
		super.onRestart();
		Log.d(TAG, "onRestart()");
	}

	@Override
	protected void onStart()
	{
		super.onStart();
		Log.d(TAG, "onStart()");
	}

	@Override
	protected void onResume()
	{
		super.onResume();
		Log.d(TAG, "onResume()");
	}

	@Override
	protected void onPause()
	{
		super.onPause();
		Log.d(TAG, "onPause()");
	}

	@Override
	protected void onStop()
	{
		super.onStop();
		Log.d(TAG, "onStop()");
	}

	@Override
	protected void onDestroy()
	{
		super.onDestroy();
		Log.d(TAG, "onDestroy()");
	}

	@Override
	public void onClick(View v)
	{
		if (v.getId() == R.id.main_btn1) {
			// System.exit(-1);
			// Process.killProcess(Process.myPid());
			// finish();

			i++;
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < 10; j++) {
				sb.append(i);
			}
			FragmentManager rm = getFragmentManager();
			rm.beginTransaction()
					.replace(R.id.main_fragmentContainer,
							Fragment1.newInstance(sb.toString()))
					.addToBackStack(null).commit();
		}
	}
}
