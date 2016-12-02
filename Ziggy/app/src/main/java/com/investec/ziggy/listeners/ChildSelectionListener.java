package com.investec.ziggy.listeners;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;

import com.investec.ziggy.TransferActivity;

/**
 * Created by Theodore.Koopman on 2016/12/02.
 */

public class ChildSelectionListener implements AdapterView.OnItemClickListener{
    public ChildSelectionListener(Context context) {
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
        Intent intent = new Intent( this.getActivity(), TransferActivity.class );
        this.getActivity().startActivity(intent);
    }
}
