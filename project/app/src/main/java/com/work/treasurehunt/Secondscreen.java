package com.work.treasurehunt;


import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Secondscreen extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_secondscreen);
	}


	public void rules(View v) {
		Intent i = new Intent(getApplicationContext(), Rules.class);
		startActivity(i);

	}

	public void play(View v) {
		SharedPreferences sharedPreferences = getSharedPreferences("prefs",
				MODE_PRIVATE);
//		Toast.makeText(this,
//				String.valueOf(sharedPreferences.getInt("number", 1)),
//				Toast.LENGTH_LONG).show();

		if (sharedPreferences != null) {
			if (sharedPreferences.getInt("number", 0) == 0) {

				startActivity(new Intent(this, Passcode.class));
				
			}

			else if (sharedPreferences.getInt("number", 0) == 1) {

				startActivity(new Intent(this, MainActivity.class));
				
			} else if (sharedPreferences.getInt("number", 0) == 2) {

				startActivity(new Intent(this, Q2.class));

			} else if (sharedPreferences.getInt("number", 0) == 3) {

				startActivity(new Intent(this, Q3.class));

			} else if (sharedPreferences.getInt("number", 0) == 4) {

				startActivity(new Intent(this, Q4.class));

			} else if (sharedPreferences.getInt("number", 0) == 4) {

				startActivity(new Intent(this, Q4.class));

			} else if (sharedPreferences.getInt("number", 0) == 5) {

				startActivity(new Intent(this, Q5.class));

			} else if (sharedPreferences.getInt("number", 0) == 6) {

				startActivity(new Intent(this, Q6.class));

			} else if (sharedPreferences.getInt("number", 0) == 7) {

				startActivity(new Intent(this, Q7.class));

			} else if (sharedPreferences.getInt("number", 0) == 8) {

				startActivity(new Intent(this, Q8.class));

			} else if (sharedPreferences.getInt("number", 0) == 9) {

				startActivity(new Intent(this, Q9.class));

			} else if (sharedPreferences.getInt("number", 0) == 10) {

				startActivity(new Intent(this, Q10.class));

			} else if (sharedPreferences.getInt("number", 0) == 11) {

				startActivity(new Intent(this, End.class));

			}

		} 
		
		else
			startActivity(new Intent(this, Passcode.class));

	}

	public void coders(View v) {

		Intent i = new Intent(getApplicationContext(), Developers.class);
		startActivity(i);

	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.secondscreen, menu);
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
