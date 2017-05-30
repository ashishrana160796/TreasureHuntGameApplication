package com.work.treasurehunt;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.work.treasurehunt.MainActivity.t1;
import static com.work.treasurehunt.Q10.t10;
import static com.work.treasurehunt.Q2.t2;
import static com.work.treasurehunt.Q3.t3;
import static com.work.treasurehunt.Q4.t4;
import static com.work.treasurehunt.Q5.t5;
import static com.work.treasurehunt.Q6.t6;
import static com.work.treasurehunt.Q7.t7;
import static com.work.treasurehunt.Q8.t8;
import static com.work.treasurehunt.Q9.t9;

public class EditPuzzles extends AppCompatActivity {

    EditText p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, phn;
    // TextView t1, t2, t3, t4, t5, t6, t7, t8 , t9, t10;
    // Context context;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_puzzles);


        p1 = (EditText)findViewById(R.id.puzzle1);
        p2 = (EditText)findViewById(R.id.puzzle2);
        p3 = (EditText)findViewById(R.id.puzzle3);
        p4 = (EditText)findViewById(R.id.puzzle4);
        p5 = (EditText)findViewById(R.id.puzzle5);
        p6 = (EditText)findViewById(R.id.puzzle6);
        p7 = (EditText)findViewById(R.id.puzzle7);
        p8 = (EditText)findViewById(R.id.puzzle8);
        p9 = (EditText)findViewById(R.id.puzzle9);
        p10 = (EditText)findViewById(R.id.puzzle10);

        //  phn = (EditText)findViewById(R.id.phoneNo);

        /*
        t1 = (TextView)findViewById(R.id.q1);
        t2 = (TextView)findViewById(R.id.q2);
        t3 = (TextView)findViewById(R.id.q3);
        t4 = (TextView)findViewById(R.id.q4);
        t5 = (TextView)findViewById(R.id.q5);
        t6 = (TextView)findViewById(R.id.q6);
        t7 = (TextView)findViewById(R.id.q7);
        t8 = (TextView)findViewById(R.id.q8);
        t9 = (TextView)findViewById(R.id.q9);
        t10 = (TextView)findViewById(R.id.q10);

        context = getApplicationContext();
        */

    }


    public void onSavePuzzle(View view){

        String sp1 = p1.getText().toString();
        String sp2 = p2.getText().toString();
        String sp3 = p3.getText().toString();
        String sp4 = p4.getText().toString();
        String sp5 = p5.getText().toString();
        String sp6 = p6.getText().toString();
        String sp7 = p7.getText().toString();
        String sp8 = p8.getText().toString();
        String sp9 = p9.getText().toString();
        String sp10 = p10.getText().toString();

        //String spphn = phn.getText().toString();

        if(sp1 !=null && sp2!=null && sp3!=null && sp4!=null && sp5!=null && sp6!=null && sp7!=null && sp8!=null && sp9!=null && sp10!=null ){

            //these views generate null pointer exceptions

            /*t1.setText(sp1);
            t2.setText(sp2);
            t3.setText(sp3);
            t4.setText(sp4);
            t5.setText(sp5);
            t6.setText(sp6);
            t7.setText(sp7);
            t8.setText(sp8);
            t9.setText(sp9);
            t10.setText(sp10);
            Toast.makeText(this, "Changes Done", Toast.LENGTH_LONG).show();
*/
            // SharedPreference Usage


            SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);
            SharedPreferences.Editor editor = prefs.edit();

            editor.putString("t1",sp1);
            editor.putString("t2",sp2);
            editor.putString("t3",sp3);
            editor.putString("t4",sp4);
            editor.putString("t5",sp5);
            editor.putString("t6",sp6);
            editor.putString("t7",sp7);
            editor.putString("t8",sp8);
            editor.putString("t9",sp9);
            editor.putString("t10",sp10);
            editor.commit();

            Toast.makeText(this, "Changes are saved", Toast.LENGTH_LONG).show();

        }
        else
        {
            Toast.makeText(this, "All entries Not Filled", Toast.LENGTH_LONG).show();
        }

    }


    public void onResetPuzzle(View v){

        String clue1 = "We roll in cash everywhere, but we it safe here.";
        String clue2 = "I’m full of pins and interesting stuff People stare and can’t get enough Paper and invites hang around Up on the wall I can be found.";
        String clue3 = "If you want your souls lift where the creature drifts This is a present I would say I wish you well this day.";
        String clue4 = "Somewhere deep inside lies a blue sky All drowned in it Jack, Rose and a ship so high.";
        String clue5 = "There is a place we go for a walk The children play and we can talk Find this place if you want a lark.";
        String clue6 = "Caution is needed going this way A tarmac place of bay bay bay Now is the time to leave the car If you leave from here you’ll go far.";
        String clue7 = "Saving net to protect her, But still cannot get her.";
        String clue8 = "Take note of all I say Observed only by day Looked at by all bar teach With chalk to me you reach.";
        String clue9 = "We roll in cash everywhere, but we it safe here.";
        String clue10 = "To solve the hunt you must get Into the room wired to the net Crammed with tech and full of code The clue is hidden in this abode.";

        // yields null pointer exception
        /*
        t1.setText(clue1);
        t2.setText(clue2);
        t3.setText(clue3);
        t4.setText(clue4);
        t5.setText(clue5);
        t6.setText(clue6);
        t7.setText(clue7);
        t8.setText(clue8);
        t9.setText(clue9);
        t10.setText(clue10);
        */


        SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("t1",clue1);
        editor.putString("t2",clue2);
        editor.putString("t3",clue3);
        editor.putString("t4",clue4);
        editor.putString("t5",clue5);
        editor.putString("t6",clue6);
        editor.putString("t7",clue7);
        editor.putString("t8",clue8);
        editor.putString("t9",clue9);
        editor.putString("t10",clue10);
        editor.commit();

        Toast.makeText(this, "Resetting Done", Toast.LENGTH_LONG).show();

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
