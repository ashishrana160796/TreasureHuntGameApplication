package com.work.treasurehunt;



import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Splash extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		
		Thread timer = new Thread(){
			public void run() {
					try {
					//	Toast.makeText(Splash.this, "insider", Toast.LENGTH_SHORT).show();
						sleep(3000);
					} catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					finally{
						Intent i = new Intent(getApplicationContext(),Secondscreen.class);
						startActivity(i);
						finish();
					}
				}
			};timer.start();
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
