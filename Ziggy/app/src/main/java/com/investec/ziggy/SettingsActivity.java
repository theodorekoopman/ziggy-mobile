package com.investec.ziggy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.investec.ziggy.listeners.SaveSettingsListener;

public class SettingsActivity extends AppCompatActivity {

    private EditText serverAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        this.setServerAddress((EditText)this.findViewById(R.id.server_address));

        Button button = (Button)this.findViewById(R.id.save);
        button.setOnClickListener(new SaveSettingsListener(this));
    }

    public String getServerAddressSetting() {
        return  this.getServerAddress().getText().toString();
    }

    private EditText getServerAddress() {
        return serverAddress;
    }

    private void setServerAddress(EditText serverAddress) {
        this.serverAddress = serverAddress;
    }
}
