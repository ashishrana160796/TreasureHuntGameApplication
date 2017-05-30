package com.work.treasurehunt;


import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.work.treasurehunt.EditPuzzles;

public class Developers extends ActionBarActivity {

	final private String devid = "Sicario";
	final private String password = "Hitman";
	EditText userui, passui;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_developers);

		userui = (EditText) findViewById(R.id.devid);
		passui = (EditText) findViewById(R.id.password);


	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.developers, menu);
		return true;
	}

	// action_settings is defined in the menu and from there reference to id is used

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

	// User Method

	public void onLoginDev(View v){

	String devstr = userui.getText().toString();
	String passstr = passui.getText().toString();

	if(devstr != null && passstr!=null)
	{
		if(devstr.equals(devid) && passstr.equals(password))
		{
			Intent epintent = new Intent(this, EditPuzzles.class);
			startActivity(epintent);
		}
		else{
			Toast.makeText(this,"Incorrect Entries", Toast.LENGTH_LONG);
		}

	}
	else{

		Toast.makeText(this,"Required Fields Are Empty", Toast.LENGTH_LONG);

	}

	}



}



