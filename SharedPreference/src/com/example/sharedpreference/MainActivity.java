package com.example.sharedpreference;

import android.support.v7.app.ActionBarActivity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
	EditText et1, et2, et3, et4;
	Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void saveData(View v) {
		// TODO Auto-generated method stub
    	et1 = (EditText) findViewById(R.id.editText1);
    	et2 = (EditText) findViewById(R.id.editText2);
    	SharedPreferences sp = getSharedPreferences("MyData", MODE_PRIVATE);
    	SharedPreferences.Editor ed = sp.edit();
    	ed.putString("fl1", et1.getText().toString());
    	ed.putString("fl2", et2.getText().toString());
    	ed.commit();
    	Toast.makeText(this, "Data saved...", Toast.LENGTH_LONG).show();
	}
    
    public void saveData_alt(View v) {
		// TODO Auto-generated method stub
    	et1 = (EditText) findViewById(R.id.editText1);
    	et2 = (EditText) findViewById(R.id.editText2);
    	SharedPreferences sp = this.getPreferences(this.MODE_PRIVATE);
    	SharedPreferences.Editor ed = sp.edit();
    	ed.putString("f_alt_l1", et1.getText().toString());
    	ed.putString("f_alt_l2", et2.getText().toString());
    	ed.commit();
    	Toast.makeText(this, "Data saved using alternative method...", Toast.LENGTH_LONG).show();
	}
    public void loadData(View v) {
		// TODO Auto-generated method stub
    	et3 = (EditText) findViewById(R.id.editText3);
    	et4 = (EditText) findViewById(R.id.editText4);
    	SharedPreferences sp = getSharedPreferences("MyData", MODE_PRIVATE);
    	String st1 = sp.getString("fl1", "Field 1");
    	String st2 = sp.getString("fl2", "Field 2");
    	et3.setText(st1);
    	et4.setText(st2);
    	Toast.makeText(this, "Data Retrieved...", Toast.LENGTH_LONG).show();
	}
    public void loadData_alt(View v) {
		// TODO Auto-generated method stub
    	et3 = (EditText) findViewById(R.id.editText3);
    	et4 = (EditText) findViewById(R.id.editText4);
    	SharedPreferences sp = this.getPreferences(this.MODE_PRIVATE);
    	String st1 = sp.getString("f_alt_l1", "Field 1");
    	String st2 = sp.getString("f_alt_l2", "Field 2");
    	et3.setText(st1);
    	et4.setText(st2);
    	Toast.makeText(this, "Data Retrieved using alternative method...", Toast.LENGTH_LONG).show();
	}
}

//Adding this line in TestBranch..