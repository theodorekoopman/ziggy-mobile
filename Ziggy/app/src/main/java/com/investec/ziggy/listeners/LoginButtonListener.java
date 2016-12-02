package com.investec.ziggy.listeners;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.investec.ziggy.BalanceActivity;

/**
 * Created by Theodore.Koopman on 2016/12/02.
 */

public class LoginButtonListener implements View.OnClickListener {
    public LoginButtonListener(Context context ) {
        this.setActivity(context);
    }

    private Context activity;

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this.getActivity(), BalanceActivity.class);
        this.getActivity().startActivity(intent);
    }

    private Context getActivity() {
        return activity;
    }

    private void setActivity(Context activity) {
        this.activity = activity;
    }
}
