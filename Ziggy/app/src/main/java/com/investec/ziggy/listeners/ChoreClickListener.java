package com.investec.ziggy.listeners;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

/**
 * Created by Theodore.Koopman on 2016/12/02.
 */

public class ChoreClickListener implements AdapterView.OnItemClickListener {
    public ChoreClickListener(Context context) {
        this.setActivity(context);
    }

    private Context activity;

    private Context getActivity() {
        return activity;
    }

    private void setActivity(Context activity) {
        this.activity = activity;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this.getActivity(), "Making payment...", Toast.LENGTH_LONG ).show();
    }
}
