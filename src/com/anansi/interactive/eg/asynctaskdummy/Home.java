package com.anansi.interactive.eg.asynctaskdummy;

import java.net.URL;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Home extends Activity {
	Button tombol;
	EditText url;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		//getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.home_act);

		StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
		StrictMode.setThreadPolicy(policy);

		url	= (EditText) findViewById(R.id.editText1);
		tombol	= (Button)	 findViewById(R.id.button1);

		//final String _url = url.getText().toString();
		
		
		tombol.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				CobakAja cobakk = new CobakAja();
				cobakk.execute(url.getText().toString());
			}
		});
		
		
	}
			
			
	
	
	public  class CobakAja extends AsyncTask<String, Void, String> {
		protected void onPreExecute(){
			Toast.makeText(Home.this, "preExecute", Toast.LENGTH_LONG).show();
		}
		@Override
		protected String doInBackground(String... params) {
			// TODO Auto-generated method stub
			String lele = params[0];
			Log.e("begron", "bernilai " + lele);
	        return lele;
		}
				 
		 
		 protected void onPostExecute(String result){
		       
			 	Log.e("PostExecuteee", "AsyncTask returned : " + result);
		        alertbox(result);
		    }

		
		}
		
	
		
		
	
	public void alertbox(String pesan)
	{   new AlertDialog.Builder(this)
	        .setMessage(pesan)
	        .setNeutralButton(android.R.string.cancel,
	                new DialogInterface.OnClickListener() 
	                {   public void onClick(DialogInterface dialog, int whichButton) {}
	                })
	        .show();
	}
}