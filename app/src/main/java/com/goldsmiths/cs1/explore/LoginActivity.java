package com.goldsmiths.cs1.explore;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class LoginActivity extends ActionBarActivity implements View.OnClickListener {

    Button signIn;
    Button register;
    Button MoMo;
    Button Elhaj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findViews();
    }
    private void findViews(){

        signIn = (Button) findViewById( R.id.sign_in_button );
        signIn.setOnClickListener( this );

        register = (Button) findViewById(R.id.register_button);
        register.setOnClickListener(this);

        MoMo = (Button) findViewById(R.id.momo);
        MoMo.setOnClickListener(this);

        Elhaj = (Button) findViewById(R.id.Elhaj);
        Elhaj.setOnClickListener(this);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if ( id == R.id.sign_in_button){
            Toast.makeText(LoginActivity.this, "YOU PRESSED ME", Toast.LENGTH_SHORT ).show();
        }

        if (id == R.id.register_button) {
            Toast.makeText(LoginActivity.this, "Fuck you assface", Toast.LENGTH_SHORT).show();
        }

        if (id == R.id.momo) {
            Toast.makeText(LoginActivity.this, "Where is the loginactivity?", Toast.LENGTH_LONG).show();
        }

        if (id == R.id.Elhaj) {
            Toast.makeText(LoginActivity.this, "Should I compare thee to a shitty day?", Toast.LENGTH_LONG).show();
        }
    }
}
