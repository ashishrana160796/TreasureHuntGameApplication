package com.work.treasurehunt;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import net.sourceforge.zbar.Symbol;

public class Q9 extends Activity {

    private static final int ZBAR_SCANNER_REQUEST = 0;
    private static final int ZBAR_QR_SCANNER_REQUEST = 1;
    @NonNull public static TextView t9;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q9);

        t9 = (TextView) findViewById(R.id.q9);

        SharedPreferences prefs = getSharedPreferences("prefs",
				MODE_PRIVATE);
		Editor editor = prefs.edit();
		editor.putInt("number", 9);
		editor.commit();
    }

    public void launchScanner(View v) {
        if (isCameraAvailable()) {
            Intent intent = new Intent(this, ZBarScannerActivity.class);
            startActivityForResult(intent, ZBAR_SCANNER_REQUEST);
        } else {
            Toast.makeText(this, "Rear Facing Camera Unavailable", Toast.LENGTH_SHORT).show();
        }
    }

    public void launchQRScanner(View v) {
        if (isCameraAvailable()) {
            Intent intent = new Intent(this, ZBarScannerActivity.class);
            intent.putExtra(ZBarConstants.SCAN_MODES, new int[]{Symbol.QRCODE});
            startActivityForResult(intent, ZBAR_SCANNER_REQUEST);
        } else {
            Toast.makeText(this, "Rear Facing Camera Unavailable", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean isCameraAvailable() {
        PackageManager pm = getPackageManager();
        return pm.hasSystemFeature(PackageManager.FEATURE_CAMERA);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case ZBAR_SCANNER_REQUEST:
            case ZBAR_QR_SCANNER_REQUEST:
                if (resultCode == RESULT_OK) {
                    if(data.getStringExtra(ZBarConstants.SCAN_RESULT).equals("Q9"))
                    		{
                    			Toast.makeText(this, "You Gotcha ninth QR right.", Toast.LENGTH_LONG).show();
                    			Intent i = new Intent(this,Q10.class);
                    			startActivity(i);
                    			finish();
                    		}
                    else
                    {
                    	AlertDialog alertDialog = new AlertDialog.Builder(
                                this).create();
         
                // Setting Dialog Title
                alertDialog.setTitle("Try Again!");
         
                // Setting Dialog Message
                alertDialog.setMessage("Your answer is wrong");
         
                // Setting Icon to Dialog
               
         
                // Setting OK Button
                alertDialog.setButton("Go back", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                        // Write your code here to execute after dialog closed
                        	dialog.cancel();
                        }
                });
         
                // Showing Alert Message
                alertDialog.show();
                    }
                
                } else if(resultCode == RESULT_CANCELED && data != null) {
                    String error = data.getStringExtra(ZBarConstants.ERROR_INFO);
                    if(!TextUtils.isEmpty(error)) {
                        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
                    }
                }
                break;
        }
    }
}
