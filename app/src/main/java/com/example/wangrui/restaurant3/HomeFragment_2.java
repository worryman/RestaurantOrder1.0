package com.example.wangrui.restaurant3;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

public class HomeFragment_2 extends Fragment{
	private VideoView videoView;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		final View view = inflater.inflate(R.layout.fragment_home_2, null);

		view.findViewById(R.id.fl2).setVisibility(View.GONE);

		view.findViewById(R.id.imageView2_1).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
//				showPopupWindow(v);
				view.findViewById(R.id.fl2).setVisibility(View.VISIBLE);
				videoView = (VideoView) view.findViewById(R.id.videoView2);
				videoView.setVideoURI(Uri.parse("android.resource://com.example.wangrui.restaurant3/" + R.raw.dish4));
				MediaController mediaController = new MediaController(getContext());
				videoView.setMediaController(mediaController);
				videoView.start();

			}
		});
		view.findViewById(R.id.fl2).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				videoView.pause();
				view.findViewById(R.id.fl2).setVisibility(View.GONE);
			}
		});
		return view;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);


	}




	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

	}

}
