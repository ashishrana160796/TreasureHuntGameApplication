package com.work.treasurehunt;



import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class End extends ActionBarActivity {

	String nostr = null;
	EditText e1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_end);


		e1 = (EditText)findViewById(R.id.phonebox);


	}

	public void  onCallNow(View v){

		nostr = e1.getText().toString();
		if(e1!=null && nostr.length()==10)
		{
			Toast.makeText(this,"Placing The Call", Toast.LENGTH_SHORT).show();

			Intent in=new Intent(Intent.ACTION_CALL,Uri.parse("tel:"+nostr));
			startActivity(in);

		}
		else
			Toast.makeText(this, "Enter Proper Number", Toast.LENGTH_LONG).show();

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
