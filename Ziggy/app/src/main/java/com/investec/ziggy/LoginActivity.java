package com.investec.ziggy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.investec.ziggy.listeners.LoginButtonListener;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText password = (EditText) findViewById(R.id.password);
        Button loginButton = (Button) findViewById(R.id.login_button);

        loginButton.setOnClickListener( new LoginButtonListener(this) );
    }
}
