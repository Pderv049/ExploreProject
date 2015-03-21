package com.goldsmiths.cs1.explore;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class RegisterActivity extends ActionBarActivity implements View.OnClickListener {


    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        findViews();
    }

    private void findViews(){

        register = (Button) findViewById(R.id.register_button);
        register.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        int id =v.getId();

        if(id == R.id.register_button) {
            Toast.makeText(RegisterActivity.this, "I'm still useless hehehe", Toast.LENGTH_SHORT).show();
        }

    }
}