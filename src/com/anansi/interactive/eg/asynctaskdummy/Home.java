package com.anansi.interactive.eg.asynctaskdummy;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;

public class Home extends Activity {
	Button fetchBtn;
	EditText url;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_act);
	
		fetchBtn = (Button)findViewById(R.id.button1);
		url		 = (EditText)findViewById(R.id.editText1);
		
		//fetchFileTask().execute("http://i47.tinypic.com/2a7ei5w.gif");
		
		
	}
	
	private class fetchFileTask() extends AsyncTask<URL, Integer, Long>{
		
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home_act, menu);
		return true;
	}

}
