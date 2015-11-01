package com.example.farmer;

import android.os.Bundle;
import android.widget.ImageView;

/**
 * @author dipenp
 *
 */
public class Item3Activity extends Drawer {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		/**
		 * Adding our layout to parent class frame layout.
		 */
		getLayoutInflater().inflate(R.layout.activity_main, frameLayout);
		
		/**
		 * Setting title and itemChecked  
		 */
		mDrawerList.setItemChecked(position, true);
		setTitle(listArray[position]);
		
			}
}
