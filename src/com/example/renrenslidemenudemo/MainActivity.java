package com.example.renrenslidemenudemo;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.WindowManager;
import android.widget.LinearLayout;

public class MainActivity extends Activity {
	
	/**
	 * 主内容的布局。
	 */
	private View content;

	/**
	 * menu的布局。
	 */
	private View menu;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initView();
		setListener();
		initData();
	}

	private void setListener(){
		
	}
	
	/**
	 * 包括获取屏幕的宽度，给content布局重新设置宽度，给menu布局重新设置宽度和偏移距离等
	 */
	private void initData() {
		SlideMenuUtil smu = new SlideMenuUtil(this, content, menu);
		smu.init();
	}

	/**
	 * 初始化一些关键性数据
	 */
	private void initView() {
		content = findViewById(R.id.content);
		menu = findViewById(R.id.menu);
	}
	
}
