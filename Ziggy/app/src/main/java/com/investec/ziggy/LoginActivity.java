package com.investec.ziggy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import com.investec.ziggy.listeners.LoginButtonListener;

public class LoginActivity extends AppCompatActivity {

    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        this.setPassword((EditText) findViewById(R.id.password));
        Button loginButton = (Button) findViewById(R.id.login_button);

        loginButton.setOnClickListener( new LoginButtonListener(this) );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        boolean result = true;

        switch (item.getItemId()) {
            case R.id.options: {
                Intent intent = new Intent(this, SettingsActivity.class);
                this.startActivity(intent);
                break;
            }
            default:{
               result = super.onOptionsItemSelected(item);
            }
        }
        return result;
    }

    public EditText getPassword() {
        return password;
    }

    private void setPassword(EditText password) {
        this.password = password;
    }
}
