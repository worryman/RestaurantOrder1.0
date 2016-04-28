package com.example.wangrui.restaurant3;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends FragmentActivity {

    public final static int num = 3 ; 
    
    Fragment homeFragment;
    Fragment personFragment;
    Fragment sorttypeFragment;
    private FragmentManager fragmentManager;
    private FragmentTransaction transaction;
    private RadioGroup radioGroup;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		fragmentManager = getSupportFragmentManager();
        radioGroup = (RadioGroup)findViewById(R.id.radioGroup1);
        ((RadioButton)radioGroup.findViewById(R.id.radio0)).setChecked(true);
        
        transaction = fragmentManager.beginTransaction();
        Fragment fragment = new HomeFragment();
        transaction.replace(R.id.content, fragment);
        transaction.commit();
       
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				switch (checkedId) {
					case R.id.radio0:
						transaction = fragmentManager.beginTransaction();
						Fragment homeFragment = new HomeFragment();
						transaction.replace(R.id.content, homeFragment);
						transaction.commit();
						break;
					case R.id.radio1:
						transaction = fragmentManager.beginTransaction();
						Fragment sortFragment = new CartFragment();
						transaction.replace(R.id.content, sortFragment);
						transaction.commit();
						break;
					case R.id.radio2:
						transaction = fragmentManager.beginTransaction();
						Fragment personFragment = new OrderFragment();
						transaction.replace(R.id.content, personFragment);
						transaction.commit();
						break;
				}

			}
		});
	}


}
