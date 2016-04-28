package com.example.wangrui.restaurant3;

import android.app.ActionBar;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.MediaController;
import android.widget.PopupWindow;
import android.widget.SimpleAdapter;
import android.widget.VideoView;

import java.util.List;
import java.util.Map;

public class HomeFragment_1 extends Fragment {
	private List<Map<String,Object>> mData;
	private int flag;
	private String[] contentString;
	private SimpleAdapter adapter;
	private Context mContext2 =null ;
	private int position;
	private VideoView videoView;
	private FrameLayout fl;




	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		final View view = inflater.inflate(R.layout.fragment_home_1, container,false);
//		ListView list = (ListView)view.findViewById(R.id.lv1);

		view.findViewById(R.id.fl).setVisibility(View.GONE);

		view.findViewById(R.id.imageView1).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
//				showPopupWindow(v);
				view.findViewById(R.id.fl).setVisibility(View.VISIBLE);
				videoView = (VideoView) view.findViewById(R.id.videoView);
				videoView.setVideoURI(Uri.parse("android.resource://com.example.wangrui.restaurant3/" + R.raw.dish1));
				MediaController mediaController = new MediaController(getContext());
				videoView.setMediaController(mediaController);
				videoView.start();

			}
		});
		view.findViewById(R.id.fl).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				videoView.pause();
				view.findViewById(R.id.fl).setVisibility(View.GONE);
			}
		});
		return view;
	}
//	public  HomeFragment_1(){}
//	public HomeFragment_1(Context context,int position,String[] contentString){
//		this.context = context;
//		Bundle bundle = new Bundle();
//		bundle.putInt("position",position);
//		bundle.putStringArray("contentString",contentString);
//		setArguments(bundle);
//	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);


		}




	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

	}

//	private void showPopupWindow(View view) {
//		//一个自定义的布局
//
//
//		View contentView = LayoutInflater.from(getContext()).inflate(R.layout.popupwindow, null);
//		VideoView videoView = (VideoView)contentView.findViewById(R.id.videoView);
//		videoView.setVideoPath("/assets/dish1.rmvb");
//		videoView.start();
//		final PopupWindow popupWindow = new PopupWindow(contentView,
//				ViewPager.LayoutParams.WRAP_CONTENT, ViewPager.LayoutParams.WRAP_CONTENT, true);
//
//		popupWindow.setContentView(videoView);
//		popupWindow.setTouchable(true);
//
//		popupWindow.setTouchInterceptor(new View.OnTouchListener() {
//			@Override
//			public boolean onTouch(View v, MotionEvent event) {
//				return false;
//			}
//		});
//		//设置POPUPWINDOW背景
//		popupWindow.setBackgroundDrawable(getResources().getDrawable(R.drawable.dish1));
//		popupWindow.showAsDropDown(view);
//	}

}
