package com.example.helloworld;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment1 extends Fragment
{
	public static final String TAG = MainActivity.TAG;
	public static final String BUNDLE_KEY_WORD = "word";

	private String mShow;

	public static Fragment1 newInstance(String word)
	{
		Fragment1 fragment1 = new Fragment1();
		Bundle bundle = new Bundle();
		bundle.putString(BUNDLE_KEY_WORD, word);
		fragment1.setArguments(bundle);

		return fragment1;
	}

	@Override
	public void onAttach(Activity activity)
	{
		super.onAttach(activity);
		Log.d(TAG, "fg: onAttach");
	}

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setRetainInstance(true);
		if (getArguments() != null) {
			mShow = getArguments().getString(BUNDLE_KEY_WORD);
		}
		Log.d(TAG, "fg: onCreate");
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState)
	{
		View v = inflater.inflate(R.layout.fragment_fg1, container, false);
		TextView tv = (TextView) v.findViewById(R.id.fg1_tv);
		if (mShow != null) {
			tv.setText(mShow);
		}
		Log.d(TAG, "fg: onCreateView");

		return v;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState)
	{
		super.onActivityCreated(savedInstanceState);
		Log.d(TAG, "fg: onActivityCreated");
	}

	@Override
	public void onStart()
	{
		super.onStart();
		Log.d(TAG, "fg: onStart");
	}

	@Override
	public void onResume()
	{
		super.onResume();
		Log.d(TAG, "fg: onResume");
	}

	@Override
	public void onPause()
	{
		super.onPause();
		Log.d(TAG, "fg: onPause");
	}

	@Override
	public void onStop()
	{
		super.onStop();
		Log.d(TAG, "fg: onStop");
	}

	@Override
	public void onDestroyView()
	{
		super.onDestroyView();
		Log.d(TAG, "fg: onDestroyView");
	}

	@Override
	public void onDestroy()
	{
		super.onDestroy();
		Log.d(TAG, "fg: onDestroy");
	}

	@Override
	public void onDetach()
	{
		super.onDetach();
		Log.d(TAG, "fg: onDetach");
	}
}
