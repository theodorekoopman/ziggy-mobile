package com.investec.ziggy.listeners;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.investec.ziggy.SettingsActivity;
import com.investec.ziggy.common.PortfolioManager;

/**
 * Created by theodore.koopman on 2016/12/08.
 */

public class SaveSettingsListener implements View.OnClickListener {

    private SettingsActivity activity;

    public  SaveSettingsListener(SettingsActivity activity) {
        this.setActivity(activity);
    }

    @Override
    public void onClick(View view) {
        PortfolioManager.getInstance().setServerAddress(this.getActivity().getServerAddressSetting());
        Toast.makeText(this.getActivity(), "Saved settings", Toast.LENGTH_LONG).show();
    }

    public SettingsActivity getActivity() {
        return activity;
    }

    public void setActivity(SettingsActivity activity) {
        this.activity = activity;
    }
}
