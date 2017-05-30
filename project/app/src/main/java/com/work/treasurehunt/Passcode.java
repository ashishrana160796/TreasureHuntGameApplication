package com.work.treasurehunt;


import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Passcode extends ActionBarActivity {
//	EditText ed;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.passcode_activity);
		 SharedPreferences prefs = getSharedPreferences("prefs",
					MODE_PRIVATE);
			Editor editor = prefs.edit();
			editor.putInt("number", 0);
			editor.commit();
		
//		ed = (EditText)findViewById(R.id.editText1);
	}
	public void go(View v){
/*		if(ed.getText().toString().equals("")true)
		{
			*/
			Intent i = new Intent(this,MainActivity.class);
			startActivity(i);
			finish();

//	}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.developers, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			Intent i = new Intent(this, Developers.class);
			startActivity(i);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
